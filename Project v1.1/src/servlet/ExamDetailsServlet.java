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

import bean.Examfile;
import bean.Noti;
import utils.ExamfileDAO;
import bean.ExamDetail;
import utils.MyUtils;
import utils.NotiDAO;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/examDetail")
public class ExamDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExamDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String errorString = null;
        String id = request.getParameter("id");
        Examfile file = null;
        try {
        	file = ExamfileDAO.getInfo(id,conn);
        	System.out.println(file);
        }catch (SQLException e) {
          e.printStackTrace();
          errorString = e.getMessage();
        }
        ExamDetail detail = null;
        try {
        	detail = ExamfileDAO.getDetail(id,conn);
        	System.out.println(detail);
        }catch (SQLException e) {
          e.printStackTrace();
          errorString = e.getMessage();
        }
//        List<UserAccount> list = null;
//        try {
//            list = UserDAO.queryAccount(conn);
//            System.out.println(list);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            errorString = e.getMessage();
//        }
        // Lưu thông tin vào request attribute trước khi forward sang views.
        
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
        request.setAttribute("errorString", errorString);
        request.setAttribute("file", file);
        request.setAttribute("detail", detail);
        System.out.println(detail.getLeftEye());
        // Forward sang /WEB-INF/views/productListView.jsp
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/hosokham-chitiet.jsp");
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
