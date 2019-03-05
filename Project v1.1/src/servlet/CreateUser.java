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
@WebServlet("/createUser")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String name = (String) request.getParameter("name");
		
		System.out.println(name);
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
			List<Subject> subject= null;
	        try {
	            subject = SubjectDAO.querySubject(conn);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        
	        // Lưu thông tin vào request attribute trước khi forward sang views.
	        request.setAttribute("errorString", errorString);
	        request.setAttribute("subjectList", subject);
	        System.out.println(subject);
			  RequestDispatcher dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/views/them-giaovien.jsp");
		        dispatcher.forward(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		request.setCharacterEncoding("UTF-8");
		String name = (String) request.getParameter("name");
        String id = (String) request.getParameter("id");
        String date = (String) request.getParameter("dobirth");
        String sdate = (String) request.getParameter("startdate");
        String subId = (String) request.getParameter("subId");
        String role = request.getParameter("role");
        String gender = request.getParameter("gender");
        String errorString = null;
        UserAccount user = new UserAccount();
        user.setName(name);
        user.setCode(id);
        user.setDateOfBirth(date);
        user.setStartWork(sdate);
        user.setIdBomon(subId);
        user.setGender(gender);
        user.setRole(role);
        if(id=="")
        	System.out.println("y");
        else
        	System.out.println("n");
        System.out.println(name+" "+id+" "+date+" "+sdate+" "+subId+" "+role+" "+gender);
 
        if (errorString == null) {
            try {
            	UserDAO.insertUser(conn, user);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
//        request.setAttribute("department", department);
 
        // Nếu có lỗi forward (chuyển tiếp) sang trang 'edit'.
        if (errorString != null) {
        	System.out.println("Add user fail");
            List<Subject> subject= null;
            try {
                subject = SubjectDAO.querySubject(conn);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
            // Lưu thông tin vào request attribute trước khi forward sang views.
            request.setAttribute("errorString", errorString);
            request.setAttribute("subjectList", subject);
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
                    .getRequestDispatcher("/WEB-INF/views/them-giaovien.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
        	System.out.println("Add user suckshit");
            response.sendRedirect(request.getContextPath() + "/userList");
        }
    }
	
}

