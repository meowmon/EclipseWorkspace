package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.*;
public class NotiDAO {
	 public static List<Noti> queryNoti(Connection conn,String receiver) throws SQLException {
	        String sql = "Select * from noti a "//
	        		+ "where receiver=? and status='1'";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        int count=0;
	        pstm.setString(1, receiver);
	        ResultSet rs = pstm.executeQuery();
	        List<Noti> list = new ArrayList<Noti>();
	        while (rs.next()) {
	            String idu = rs.getString("iduser");
	            String content = rs.getString("content");
	            String date = rs.getString("date");

	            String status = rs.getString("status");
	            Noti noti = new Noti();
	            noti.setIdUser(idu);
	            noti.setDate(date);
	            noti.setContent(content);
	            if(status.equals("1")) {
	            	count++;}
	            list.add(noti);
	            }
	        return list;
	    }
	 public static List<Noti> queryUserNoti(Connection conn,String id,String receiver) throws SQLException {
	        String sql = "Select * from noti a "//
	        		+ "where (status='1' and a.idUser=?) and receiver='user'";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        int count=0;
	        pstm.setString(1, id);
	        ResultSet rs = pstm.executeQuery();
	        List<Noti> list = new ArrayList<Noti>();
	        while (rs.next()) {
	            String idu = rs.getString("iduser");
	            String content = rs.getString("content");
	            String date = rs.getString("date");

	            String status = rs.getString("status");
	            Noti noti = new Noti();
	            noti.setIdUser(idu);
	            noti.setDate(date);
	            noti.setContent(content);
	            if(status.equals("1")) {
	            	count++;}
	            list.add(noti);
	            }
	        return list;
	    }
	 	public static int countNoti(Connection conn,String receiver) throws SQLException{
	 		String sql = "Select a.status from noti a "//
	        		+ "where receiver=?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        int count=0;
	        pstm.setString(1, receiver);
	        ResultSet rs = pstm.executeQuery();
	        while (rs.next()) {
	        	
	            String status = rs.getString("status");
	            if(status.equals("1")) 
	            	count++;
	            }
	        
	        return count;
	 	}
	 	public static int countUserNoti(Connection conn,String id) throws SQLException{
	 		String sql = "Select a.status from noti a "//
	        		+ "where a.idUser=? and a.receiver='user'";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        int count=0;
	        pstm.setString(1, id);
	        ResultSet rs = pstm.executeQuery();
	        while (rs.next()) {
	        	
	            String status = rs.getString("status");
	            if(status.equals("1")) 
	            	count++;
	            }
	        
	        return count;
	 	}
	    public static void newNoti(Connection conn, Noti noti, String receiver) throws SQLException {
	        String sql = "Insert into noti(iduser ,content,date, status,receiver) values (?,?,?,?,?)";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, noti.getIdUser());
	        pstm.setString(2, noti.getContent());
	        pstm.setString(3, noti.getDate());
	        pstm.setString(4, "1");
	        pstm.setString(5, receiver);
	 
	        pstm.executeUpdate();
	    }
	 
	    public static void readNoti(Connection conn, String receiver) throws SQLException {
	        String sql = "Update noti set status='0' where receiver = ?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, receiver);
	 
	        pstm.executeUpdate();
	    }
	 
}
