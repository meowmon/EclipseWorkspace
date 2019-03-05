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
@WebServlet("/createRequest")
public class CreateRequestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateRequestServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		String errorString = null;
		List<Noti> noti = null;
		 try {
       	noti=NotiDAO.queryNoti(conn,"nvyt");
       	HttpSession session = request.getSession();
       	session.setAttribute("notic", NotiDAO.countNoti(conn, "nvyt"));
       } catch (SQLException e) {
           e.printStackTrace();
           errorString = e.getMessage();
       }
		 request.setAttribute("noti", noti);
			List<UserAccount> list = null;
	        try {
	            list = UserDAO.queryAccount(conn);
	            System.out.println(list);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        request.setAttribute("errorString", errorString);
	        request.setAttribute("userList", list);
		  RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/views/them-yeucau.jsp");
	        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String userId = (String) request.getParameter("userId");
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
	        request.setAttribute("userList", list);
	        List<Noti> noti = null;
			 try {
	        	noti=NotiDAO.queryNoti(conn,"nvyt");
	        	HttpSession session = request.getSession();
	        	session.setAttribute("notic", NotiDAO.countNoti(conn, "nvyt"));
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
			 request.setAttribute("noti", noti);
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/them-yeucau.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
        	System.out.println("Create request suckshit");
            response.sendRedirect(request.getContextPath() + "/requestList");
        }
    }
	
}

