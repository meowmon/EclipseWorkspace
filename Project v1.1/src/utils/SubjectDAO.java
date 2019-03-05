package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.Subject;
public class SubjectDAO {
	 public static List<Subject> querySubject(Connection conn) throws SQLException {
	        String sql = "Select a.Id, a.Name,b.name, a.Status \r\n"+
	        			"	FROM (bomon a INNER JOIN khoa b ON a.idKhoa = b.id) "							;
	        int id = 0;
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        ResultSet rs = pstm.executeQuery();
	        List<Subject> list = new ArrayList<Subject>();
	        while (rs.next()) {
	        	id++;
	            String subid = rs.getString("Id");
	            String name = rs.getString("Name");
	            String khoa = rs.getString("b.name");
	            String status = rs.getString("Status");
	            System.out.println(id+name+khoa + status);
	            Subject subject = new Subject();
	            subject.setId(id);
	            subject.setSubId(subid);
	            subject.setName(name);
	            subject.setKhoa(khoa);
	            subject.setStatus(status);
	            list.add(subject);
	        }
	        return list;
	    }
	 public static Subject findSubject(Connection conn, String id) throws SQLException {
	        String sql = "Select a.Id, a.Name,a.IdKhoa, a.Status from Bomon a where a.Id=?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, id);
	 
	        ResultSet rs = pstm.executeQuery();
	        int gid=0;
	        while (rs.next()) {
	            String name = rs.getString("Name");
	            String idKhoa = rs.getString("idKhoa");
	            String status = rs.getString("Status");
	            Subject subject = new Subject(gid, id, name, idKhoa, status);
	            return subject;
	        }
	        return null;
	    }
	 
	    public static void updateSubject(Connection conn, Subject subject) throws SQLException {
	        String sql = "Update BoMon set Name =?,idKhoa=?, Status=? where Id=? ";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, subject.getName());
	        pstm.setString(2, subject.getStatus());
	        pstm.setString(3, subject.getIdKhoa());
	        pstm.setString(4, subject.getSubId());
	        pstm.executeUpdate();
	    }
	 
	    public static void insertSubject(Connection conn, Subject subject) throws SQLException {
	        String sql = "Insert into BoMon( Name,idKhoa, Status) values (?,?,?)";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, subject.getName());
	        pstm.setString(2, subject.getIdKhoa());
	        pstm.setString(3, subject.getStatus());
	 
	        pstm.executeUpdate();
	    }
	 
	    public static void deleteSubject(Connection conn, String id) throws SQLException {
	        String sql = "Delete From BoMon where Id= ?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, id);
	 
	        pstm.executeUpdate();
	    }
	 
}
