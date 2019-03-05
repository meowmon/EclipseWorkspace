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
@WebServlet("/createSubject")
public class CreateSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
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
        List<Department> list = null;
        try {
            list = DepartmentDAO.queryDepartment(conn);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("departmentList", list);
		  RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/views/them-bomon.jsp");
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
        String depId = (String) request.getParameter("depId");
        String status= (String) request.getParameter("status");
        System.out.println(name+" "+depId);
        
        Subject sub = new Subject(name, depId,status);
 
        String errorString = null;
 
        // Mã sản phẩm phải là chuỗi chữ [a-zA-Z_0-9]
        // Có ít nhất một ký tự.
//        String regex = "\\w+";
//        if (name == null || !name.matches(regex)) {
//            errorString = "Department Name invalid!";
//        }
        if (name.length()==0) {
         errorString = "Subject Name invalid!";
        }
        if (errorString == null) {
            try {
            	SubjectDAO.insertSubject(conn, sub);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
 
        // Lưu thông tin vào request attribute trước khi forward sang views.
 
        // Nếu có lỗi forward (chuyển tiếp) sang trang 'edit'.
        if (errorString != null) {
            List<Department> list = null;
            try {
                list = DepartmentDAO.queryDepartment(conn);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
            // Lưu thông tin vào request attribute trước khi forward sang views.
            request.setAttribute("errorString", errorString);
            request.setAttribute("departmentList", list);
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
                    .getRequestDispatcher("/WEB-INF/views/them-bomon.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
            response.sendRedirect(request.getContextPath() + "/subjectList");
        }
    }
	
}
