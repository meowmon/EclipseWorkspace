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
 * Servlet implementation class DepartmentServlet
 */
@WebServlet("/departmentList")
public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentServlet() {
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
        System.out.println(list);
        // Forward sang /WEB-INF/views/productListView.jsp
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/khoa.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
