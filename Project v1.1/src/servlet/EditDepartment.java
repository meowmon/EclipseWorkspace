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

import bean.Department;
import bean.Noti;
import utils.DepartmentDAO;
import utils.MyUtils;
import utils.NotiDAO;
/**
 * Servlet implementation class editDepartment
 */
@WebServlet("/editDepartment")
public class EditDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDepartment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String id = (String) request.getParameter("id");
        System.out.println(id);
        Department department = null;
 
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
 
        try {
        	department = DepartmentDAO.findDepartment(conn, id);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
 
        // Không có lỗi.
        // Sản phẩm không tồn tại để edit.
        // Redirect sang trang danh sách sản phẩm.
        if (errorString != null && department == null) {
            response.sendRedirect(request.getServletPath() + "/departmentList");
            return;
        }
 
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("department", department);
 
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/sua-khoa.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String id = (String) request.getParameter("id");
        String name = (String) request.getParameter("name");
        String status = (String) request.getParameter("status");
        
        Department department = new Department(id, name, status);
 
        String errorString = null;
 
        try {
        	DepartmentDAO.updateDepartment(conn, department);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("department", department);
 
        // Nếu có lỗi forward sang trang edit.
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
   		 request.setAttribute("noti", noti);
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/sua-khoa.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect sang trang danh sách sản phẩm.
        else {
            response.sendRedirect(request.getContextPath() + "/departmentList");
        
    }
 
	}

}
