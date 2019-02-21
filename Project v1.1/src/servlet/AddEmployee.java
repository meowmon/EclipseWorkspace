//package servlet;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import bean.UserAccount;
//import utils.UserDAO;
//import utils.MyUtils;
//
///**
// * Servlet implementation class AddEmployee
// */
//@WebServlet("/addEmployee")
//public class AddEmployee extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public AddEmployee() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		RequestDispatcher dispatcher = request.getServletContext()
//                .getRequestDispatcher("/WEB-INF/views/them-giaovien.jsp");
//        dispatcher.forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		Connection conn = MyUtils.getStoredConnection(request);
//		 
//        String name = (String) request.getParameter("name");
//        String code = (String) request.getParameter("code");
//        String status = (String) request.getParameter("status");
//        String status = (String) request.getParameter("status");
//        String status = (String) request.getParameter("status");
//        String status = (String) request.getParameter("status");
//        System.out.println(name+" "+status);
//        
//        UserAccount user = new UserAccount(name, status);
// 
//        String errorString = null;
// 
//        // Mã sản phẩm phải là chuỗi chữ [a-zA-Z_0-9]
//        // Có ít nhất một ký tự.
////        String regex = "\\w+";
////        if (name == null || !name.matches(regex)) {
////            errorString = "Department Name invalid!";
////        }
//        if (name.length()==0) {
//         errorString = "User Name invalid!";
//        }
//        if (errorString == null) {
//            try {
//            	UserDAO.insertUser(conn, department);
//            } catch (SQLException e) {
//                e.printStackTrace();
//                errorString = e.getMessage();
//            }
//        }
// 
//        // Lưu thông tin vào request attribute trước khi forward sang views.
//        request.setAttribute("errorString", errorString);
//        request.setAttribute("user", user);
// 
//        // Nếu có lỗi forward (chuyển tiếp) sang trang 'edit'.
//        if (errorString != null) {
//            RequestDispatcher dispatcher = request.getServletContext()
//                    .getRequestDispatcher("/WEB-INF/views/them-giaovien.jsp");
//            dispatcher.forward(request, response);
//        }
//        // Nếu mọi thứ tốt đẹp.
//        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
//        else {
//            response.sendRedirect(request.getContextPath() + "/userList");
//        }
//	}
//
//}
