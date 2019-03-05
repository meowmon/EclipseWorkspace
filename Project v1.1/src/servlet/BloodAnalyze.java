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
 * Servlet implementation class BloodAnalyze
 */
@WebServlet("/BloodAnalyze")
public class BloodAnalyze extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloodAnalyze() {
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
        Blood report =null;
        try {
            report = BloodDAO.findReport(conn,request.getParameter("id"));
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        if(report==null)
        	 response.sendRedirect(request.getContextPath() + "/createBloodAnalyze?id="+request.getParameter("id"));
        else {
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("report", report);
        System.out.println(report);
        // Forward sang /WEB-INF/views/productListView.jsp
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/xetnghiemmau.jsp");
        dispatcher.forward(request, response);
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
