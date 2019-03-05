package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.Request;
public class RequestDAO {
	 public static List<Request> queryRequest(Connection conn) throws SQLException {
	        String sql = "Select a.Id, a.iduser,b.name,b.phone, a.date,a.time, a.Status from (request a inner join users b on a.iduser = b.id)";
	        int id = 0;
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        ResultSet rs = pstm.executeQuery();
	        List<Request> list = new ArrayList<Request>();
	        while (rs.next()) {
	        	id++;
	            String idr = rs.getString("Id");
	            String userid = rs.getString("idUser");
	            String username =rs.getString("b.name");
	            String dial = rs.getString("b.phone");
	            String date = rs.getString("date");
	            String time = rs.getString("time");
	            String status = rs.getString("Status");
	            System.out.println(id+status);
	            Request Request = new Request();
	            Request.setId(id);
	            Request.setRequestId(idr);
	            Request.setUserId(userid);
	            Request.setUsername(username);
	            Request.setDial(dial);
	            Request.setDate(date);
	            Request.setTime(time);
	            Request.setStatus(status);
	            list.add(Request);
	        }
	        return list;
	    }
	 public static List<Request> queryUserRequest(Connection conn,String idu) throws SQLException {
	        String sql = "Select a.Id, a.date,a.time, a.Status from (request a inner join users b on a.iduser = b.id)"//
	        		+"where a.iduser=?";
	        int id = 0;
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, idu);
	 
	        ResultSet rs = pstm.executeQuery();
	        List<Request> list = new ArrayList<Request>();
	        while (rs.next()) {
	        	id++;
	            String idr = rs.getString("Id");
	            String date = rs.getString("date");
	            String time = rs.getString("time");
	            String status = rs.getString("Status");
	            System.out.println(id+status);
	            Request Request = new Request();
	            Request.setId(id);
	            Request.setRequestId(idr);
	            Request.setDate(date);
	            Request.setTime(time);
	            Request.setStatus(status);
	            list.add(Request);
	        }
	        return list;
	    }
//	 public static Examination findExamination(Connection conn, String id) throws SQLException {
//	        String sql = "Select a.Id, a.Name, a.Status from khoa a where a.Id=?";
//	 
//	        PreparedStatement pstm = conn.prepareStatement(sql);
//	        pstm.setString(1, id);
//	 
//	        ResultSet rs = pstm.executeQuery();
//	 
//	        while (rs.next()) {
//	            String name = rs.getString("Name");
//	            String status = rs.getString("Status");
//	            Examination department = new Examination(id, name, status);
//	            return department;
//	        }
//	        return null;
//	    }
//	 
//	    public static void updateDepartment(Connection conn, Examination department) throws SQLException {
//	        String sql = "Update khoa set Name =?, Status=? where Id=? ";
//	 
//	        PreparedStatement pstm = conn.prepareStatement(sql);
//	 
//	        pstm.setString(1, department.getName());
//	        pstm.setString(2, department.getStatus());
//	        pstm.setString(3, department.getId());
//	        pstm.executeUpdate();
//	    }
//	 
	    public static void insertRequest(Connection conn, Request req) throws SQLException {
	        String sql = "Insert into request( iduser,date,time, status) values (?,?,?,?)";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, req.getUserId());
	        pstm.setString(2, req.getDate());
	        pstm.setString(3, req.getTime());
	        pstm.setString(4, "Chờ xác nhận");
	 
	        pstm.executeUpdate();
	    }
//	 
//	    public static void deleteExamination(Connection conn, String id) throws SQLException {
//	        String sql = "Delete From khoa where Id= ?";
//	 
//	        PreparedStatement pstm = conn.prepareStatement(sql);
//	 
//	        pstm.setString(1, id);
//	 
//	        pstm.executeUpdate();
//	    }
//	 
		public static void setStatus(Connection conn, String status, String id) throws SQLException {
			String sql = "Update request set Status=? where Id=? ";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, status);
	        pstm.setString(2, id);
	        pstm.executeUpdate();
		}
}
