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

import bean.Noti;
import utils.DepartmentDAO;
import utils.MyUtils;
import utils.NotiDAO;
/**
 * Servlet implementation class DeleteDepartment
 */
@WebServlet("/deleteDepartment")
public class DeleteDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDepartment() {
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
            DepartmentDAO.deleteDepartment(conn, id);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        } 
        // Nếu có lỗi, forward (chuyển tiếp) sang trang thông báo lỗi.
        if (errorString != null) {
        	errorString = "failDelete";
            // Lưu thông tin vào request attribute trước khi forward sang views.
            request.setAttribute("errorString", errorString);
            // 
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/khoa.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
            response.sendRedirect(request.getContextPath() + "/departmentList");
        }
 
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
