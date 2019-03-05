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

import bean.Disease;
import bean.Noti;
import utils.DiseaseDAO;
import utils.MyUtils;
import utils.NotiDAO;

/**
 * Servlet implementation class CreateBloodAnalyze
 */
@WebServlet("/createBloodAnalyze")
public class CreateBloodAnalyze extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBloodAnalyze() {
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
		 List<Disease> list = null;
	        try {
	            list = DiseaseDAO.queryDisease(conn);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	      request.setAttribute("diseaseList", list);
		  RequestDispatcher dispatcher = request.getServletContext()
				  .getRequestDispatcher("/WEB-INF/views/them-xetnghiemmau.jsp?id="+request.getParameter("id"));
	        dispatcher.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		String errorString =null;
		
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
			 List<Disease> list = null;
		        try {
		            list = DiseaseDAO.queryDisease(conn);
		        } catch (SQLException e) {
		            e.printStackTrace();
		            errorString = e.getMessage();
		        }
		      request.setAttribute("diseaseList", list);
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/them-xetnghiemmau.jsp?id="+request.getParameter("id"));
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
            response.sendRedirect(request.getContextPath() + "/BloodAnalyze?id="+request.getParameter("id"));
        }
	}

}
