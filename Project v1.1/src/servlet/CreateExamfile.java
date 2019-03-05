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
@WebServlet("/createExamfile")
public class CreateExamfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateExamfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		String userId = (String) request.getParameter("userId");
		String examId = (String) request.getParameter("examId");
		System.out.println(userId+examId);
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
			List<UserAccount> list = null;
	        try {
	            list = UserDAO.queryAccount(conn);
	            System.out.println(list);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        List<Examination> exam = null;
	        try {
	            exam = ExamDAO.queryExamination(conn);
	            System.out.println(list);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        
	        // Lưu thông tin vào request attribute trước khi forward sang views.
	        request.setAttribute("errorString", errorString);
	        request.setAttribute("userList", list);
	        request.setAttribute("examList", exam);
	        System.out.println(list);
			  RequestDispatcher dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/views/them-hoso.jsp");
		        dispatcher.forward(request, response);
		
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String userId = (String) request.getParameter("userId");
        String conclude = request.getParameter("conclude");
        String descrip = request.getParameter("descrip");
		String examId = (String) request.getParameter("examId");
        System.out.println(userId+examId);
        
        Examfile file = new Examfile();
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        String dateFormat = formatter.format(date);
        System.out.println(dateFormat);
        file.setDate(dateFormat);
        file.setUserId(userId);
        file.setIdKyKham(examId);
        file.setConclude(conclude);
        file.setDescrip(descrip);
        
       
        
 
        String errorString = null;
        System.out.println(userId+examId);
        if (userId == null || examId == null ) {
        	errorString = "Phải chọn Giáo viên và Kỳ khám";
        }
        ExamDetail detail = new ExamDetail();
        if (errorString == null) {
            try {
            	String ExamId = ExamfileDAO.insertExamfile(conn, file);
            	detail.setIdHoSo(ExamId);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
        int leftEye = Integer.parseInt(request.getParameter("leftEye"));
        int rightEye = Integer.parseInt(request.getParameter("rightEye"));
        int beat = Integer.parseInt(request.getParameter("beat"));
        int pressure = Integer.parseInt(request.getParameter("pressure"));
        int height = Integer.parseInt(request.getParameter("height"));
        int weight = Integer.parseInt(request.getParameter("weight"));
        String pclass = (String) request.getParameter("pclass");
        String newid=null;
        detail.setBeat(beat);
        detail.setPclass(pclass);
        detail.setHeight(height);
        detail.setPressure(pressure);
        detail.setRightEye(rightEye);
        detail.setLeftEye(leftEye);
        detail.setWeight(weight);
        
        if (errorString == null) {
            try {
            	newid = ExamfileDAO.insertExamDetail(conn, detail);
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
        	List<UserAccount> list = null;
	        try {
	            list = UserDAO.queryAccount(conn);
	            System.out.println(list);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        List<Examination> exam = null;
	        try {
	            exam = ExamDAO.queryExamination(conn);
	            System.out.println(list);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            errorString = e.getMessage();
	        }
	        
	        // Lưu thông tin vào request attribute trước khi forward sang views.
	        request.setAttribute("errorString", errorString);
	        request.setAttribute("userList", list);
	        request.setAttribute("examList", exam);
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
                    .getRequestDispatcher("/WEB-INF/views/them-hoso.jsp");
            dispatcher.forward(request, response);
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
            response.sendRedirect(request.getContextPath() + "/examDetail?id="+newid);
        }
    }
	
}

