package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;
import utils.*;
 
/**
 * Servlet implementation class CreateProduct
 */
@WebServlet("/createUserRequest")
public class CreateUserRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String id= (String) session.getAttribute("userid");
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		String errorString = null;
		List<Noti> noti = null;
		 try {
      	noti=NotiDAO.queryUserNoti(conn,id,"user");
      	
      	
      	session.setAttribute("notic", NotiDAO.countUserNoti(conn, id));
      } catch (SQLException e) {
          e.printStackTrace();
          errorString = e.getMessage();
      }
		 request.setAttribute("noti", noti);
			List<Request> list = null;
	        try {
	            list = RequestDAO.queryUserRequest(conn,id);
	            System.out.println(list);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        request.setAttribute("requestList", list);
		  RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/TeacherViews/yeucau.jsp");
	        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userid");
        String time = (String) request.getParameter("time");

        String date = (String) request.getParameter("date");
        System.out.println(userId+" "+time+" "+date);
        
        Request req = new Request(userId,time,date);
 
        String errorString = null;
 
        // Mã sản phẩm phải là chuỗi chữ [a-zA-Z_0-9]
        // Có ít nhất một ký tự.
//        String regex = "\\w+";
//        if (name == null || !name.matches(regex)) {
//            errorString = "Department Name invalid!";
//        }
//        if (userId.length()==0) {
//         errorString = "Department Name invalid!";
//        }
        if (errorString == null) {
            try {
            	RequestDAO.insertRequest(conn, req);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
 
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
 
        // Nếu có lỗi forward (chuyển tiếp) sang trang 'edit'.
        if (errorString != null) {
        	System.out.println("Create request fail");
        	List<UserAccount> list = null;
	        try {
	            list = UserDAO.queryAccount(conn);
	            System.out.println(list);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        request.setAttribute("errorString", errorString);
	        request.setAttribute("requestList", list);
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/TeacherViews/yeucau.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
        	java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date2 = new java.util.Date();
            String dateFormat = formatter.format(date2);
        	Noti notify= new Noti();
            notify.setContent("Bạn có một yêu cầu khám mới từ G"+userId);
            notify.setIdUser(userId);
            notify.setDate(dateFormat);
            try {
            	NotiDAO.newNoti(conn,notify,"nvyt");
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        	System.out.println("Create request suckshit");
            response.sendRedirect(request.getContextPath() + "/createUserRequest");
        }
    }
	
}

