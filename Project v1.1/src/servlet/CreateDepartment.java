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
@WebServlet("/createDepartment")
public class CreateDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateDepartment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Connection conn = MyUtils.getStoredConnection(request);
		String errorString=null;
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
	                .getRequestDispatcher("/WEB-INF/views/them-khoa.jsp");
	        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String name = (String) request.getParameter("name");
        String status = (String) request.getParameter("status");
        System.out.println(name+" "+status);
        
        Department department = new Department(name, status);
 
        String errorString = null;
 
        // Mã sản phẩm phải là chuỗi chữ [a-zA-Z_0-9]
        // Có ít nhất một ký tự.
//        String regex = "\\w+";
//        if (name == null || !name.matches(regex)) {
//            errorString = "Department Name invalid!";
//        }
        if (name.length()==0) {
         errorString = "Department Name invalid!";
        }
        if (errorString == null) {
            try {
            	DepartmentDAO.insertDepartment(conn, department);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
 
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("department", department);
 
        // Nếu có lỗi forward (chuyển tiếp) sang trang 'edit'.
        if (errorString != null) {
    		List<Noti> noti = null;
    		 try {
             	noti=NotiDAO.queryNoti(conn,"nvyt");
             	HttpSession session = request.getSession();
             	session.setAttribute("notic", NotiDAO.countNoti(conn, "nvyt"));
             } catch (SQLException e) {
                 e.printStackTrace();
                 errorString = e.getMessage();
             }
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/them-khoa.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
            response.sendRedirect(request.getContextPath() + "/departmentList");
        }
    }
	
}

