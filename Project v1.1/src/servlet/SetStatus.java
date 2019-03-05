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
@WebServlet("/setStatus")
public class SetStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String status = (String) request.getParameter("status");
        String id = (String) request.getParameter("id");
        String uid = (String) request.getParameter("uid");
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        String dateFormat = formatter.format(date);
        System.out.println(id+status+uid);
        String errorString = null;
        String content=null;
        if(status.equals("Chờ khám"))
        	content="Nhân viên y tế đã xác nhận lịch hẹn khám của bạn Hãy tới khám vào thời gian đã hẹn trước";
        else if (status.equals("Yêu cầu đổi lịch"))
        	content="Nhân viên y tế không thể khám cho bạn vào thời gian bạn đã hẹn, vui lòng chọn một lịch khám khác nhé";
        else if (status.equals("Đã hủy"))
        	content="Do không được hoàn thành, lịch hẹn khám của bạn đã được hủy. Hãy hẹn lại một lịch khám khác để kiểm tra sức khỏe của bạn nhé";
        Noti notify= new Noti();
        notify.setContent(content);
        notify.setIdUser(uid);
        notify.setDate(dateFormat);

        if (errorString == null) {
            try {
            	RequestDAO.setStatus(conn, status,id);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
        if (errorString == null) {
            try {
            	NotiDAO.newNoti(conn,notify,"user");
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
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
 
        // Nếu có lỗi forward (chuyển tiếp) sang trang 'edit'.
        if (errorString != null) {
        	System.out.println("setstatus fail");
        	response.sendRedirect(request.getContextPath() + "/requestList");
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
        	System.out.println("setstatus suckshit");
            response.sendRedirect(request.getContextPath() + "/requestList");
        }
    }
	
}

