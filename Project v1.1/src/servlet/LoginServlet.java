package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.UserAccount;
import utils.MyUtils;
import utils.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher //
        = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.print(username+" "+password);
		UserAccount user = null;
        boolean hasError = false;
        String errorString = null;
 
        if (username == null || password == null || username.length() == 0 || password.length() == 0) {
            hasError = true;
            errorString = "Required username and password!";
        }else {
            Connection conn = MyUtils.getStoredConnection(request);
            try {
                // Tìm user trong DB.
                user = UserDAO.findUser(conn, username, password);
 
                if (user == null) {
                    hasError = true;
                    errorString = "User Name or password invalid";
                }
            } catch (SQLException e) {
                e.printStackTrace();
                hasError = true;
                errorString = e.getMessage();
            }
        }
        // Trong trường hợp có lỗi,
        // forward (chuyển hướng) tới /WEB-INF/views/login.jsp
        if (hasError) {
            user = new UserAccount();
            user.setCode(username);
            user.setPassword(password);
 
            // Lưu các thông tin vào request attribute trước khi forward.
            request.setAttribute("errorString", errorString);
            request.setAttribute("user", user);
 
            // Forward (Chuyển tiếp) tới trang /WEB-INF/views/login.jsp
            RequestDispatcher dispatcher //
                    = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("utf-8");
            dispatcher.forward(request, response);
        }
        // Trường hợp không có lỗi.
        // Lưu thông tin người dùng vào Session.
        // Và chuyển hướng sang trang userInfo.
        else {
            HttpSession session = request.getSession();
           
            MyUtils.storeLoginedUser(session, user);
            session.setAttribute("userid", user.getCode());
//            // Nếu người dùng chọn tính năng "Remember me".
//            if (remember) {
//                MyUtils.storeUserCookie(response, user);
//            }
//            // Ngược lại xóa Cookie
//            else {
//                MyUtils.deleteUserCookie(response);
//            }
 
            // Redirect (Chuyển hướng) sang trang /userInfo.
            System.out.println(user.getRole());
            if(user.getRole().equals("0")||user.getRole().equals("1"))
            response.sendRedirect(request.getContextPath()+"/requestList");
            else if(user.getRole().equals("3"))
            response.sendRedirect(request.getContextPath()+"/createUserRequest");
            else 
            response.sendRedirect(request.getContextPath()+"/Error");
            
        }
    }

}
