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
import bean.Subject;
import utils.SubjectDAO;
import utils.MyUtils;
import utils.NotiDAO;
/**
 * Servlet implementation class DepartmentServlet
 */
@WebServlet("/subjectList")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectServlet() {
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
        List<Subject> list = null;
        try {
            list = SubjectDAO.querySubject(conn);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("subjectList", list);
        System.out.println(list);
        // Forward sang /WEB-INF/views/productListView.jsp
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/bomon.jsp");
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
