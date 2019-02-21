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
	        String sql = "Select a.Id, a.iduser, a.idsuco, a.descrip, a.Status from dskham a ";
	        int id = 0;
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        ResultSet rs = pstm.executeQuery();
	        List<Request> list = new ArrayList<Request>();
	        while (rs.next()) {
	        	id++;
	            String idr = rs.getString("Id");
	            String userid = rs.getString("idUser");
	            String suco = rs.getString("idSuCo");
	            String descrip = rs.getString("descrip");
	            String status = rs.getString("Status");
	            System.out.println(id+status);
	            Request Request = new Request();
	            Request.setRequestId(idr);
	            Request.setUserId(userid);
	            Request.setProblemId(suco);
	            Request.setDescrip(descrip);
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
//	    public static void insertDepartment(Connection conn, Examination department) throws SQLException {
//	        String sql = "Insert into khoa( Name, Status) values (?,?)";
//	 
//	        PreparedStatement pstm = conn.prepareStatement(sql);
//	 
//	        pstm.setString(1, department.getName());
//	        pstm.setString(2, department.getStatus());
//	 
//	        pstm.executeUpdate();
//	    }
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
}
