package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.UserAccount;
public class UserDAO{
	public static UserAccount findUser(Connection conn, //
            String userName, String password) throws SQLException {
 
        String sql = "Select a.id,a.Code, a.Password,a.role, a.Gender from Users a " //
                + " where a.Code = ? and a.password= ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	String id = rs.getString("id");
            String gender = rs.getString("Gender");
            String role = rs.getString("role");
            UserAccount user = new UserAccount();
            user.setRole(role);
            user.setCode(id);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }
	public static UserAccount findUserName(Connection conn, String id) throws SQLException {
 
        String sql = "a.Name from Users a " //
                + " where a.id";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	String name = rs.getString("name");
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setName(name);
            user.setCode(id);
            return user;
        }
        return null;
    }
	 public static List<UserAccount> queryAccount(Connection conn) throws SQLException {
	        String sql = " SELECT a.id,a.name,a.Code,a.BirthDay,a.Status,b.Name,c.Name\r\n" + 
	        		"	    	FROM ((Users a\r\n" + 
	        		"	    	INNER JOIN BoMon b ON a.idBoMon = b.id)\r\n" + 
	        		"	    	INNER JOIN Khoa c ON b.idKhoa = c.id) ";
//	        SELECT Users.id,Users.Name,Users.Code,Users.BirthDay,BoMon.Name,Khoa.Name
//	    	FROM ((Users
//	    	INNER JOIN BoMon ON Users.idBoMon = BoMon.id)
//	    	INNER JOIN Khoa ON BoMon.idKhoa = Khoa.id);
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        int id=0;
	        ResultSet rs = pstm.executeQuery();
	        List<UserAccount> list = new ArrayList<UserAccount>();
	        while (rs.next()) {
	        	id++;
	            String uid = rs.getString("id");
	            String name = rs.getString("Name");
	            String status = rs.getString("Status");
	            String code = rs.getString("Code");
	            String birthday = (String) rs.getString("Birthday");
	            String bomon = rs.getString("b.Name");
	            String khoa = rs.getString("c.Name");
	            System.out.println(name + status + code + birthday + bomon + khoa);
	            UserAccount users = new UserAccount();
	            users.setId(id);
	            users.setName(name);
	            users.setStatus(status);	
	            users.setCode(uid);
	            users.setBoMon(bomon);
	            users.setDateOfBirth(birthday);
	            users.setKhoa(khoa);
	            
	            list.add(users);
	        }
	        return list;
	    }
	 public static void insertUser(Connection conn, UserAccount user)throws SQLException {
		 String sql=null;
		 PreparedStatement pstm =null;
		 if(user.getCode()=="") {
			 sql = "INSERT INTO users(name,role,birthday,startwork,gender,idbomon,password) values(?,?,?,?,?,?,?)";
			 pstm = conn.prepareStatement(sql);
		     pstm.setString(1, user.getName());
		     pstm.setString(2, user.getRole());
		     pstm.setString(3, user.getDateOfBirth());
		     pstm.setString(4, user.getStartWork());
		     pstm.setString(5, user.getGender());
		     pstm.setString(6, user.getIdBomon());
		     pstm.setString(7, "thanglong123");
		     pstm.executeUpdate();

			 System.out.println("INSERT SUCKSHIT");
			 getNewID(conn,user);
		     
		 }
		 else {
			 sql = "INSERT INTO users(name,role,birthday,startwork,gender,idbomon,password,id) values(?,?,?,?,?,?,?,?)";
			 pstm = conn.prepareStatement(sql);
			 pstm.setString(1, user.getName());
		        pstm.setString(2, user.getRole());
		        pstm.setString(3, user.getDateOfBirth());
		        pstm.setString(4, user.getStartWork());
		        pstm.setString(5, user.getGender());
		        pstm.setString(6, user.getIdBomon());
		        pstm.setString(7, "thanglong123");
		        pstm.setString(8, user.getCode());
		        pstm.executeUpdate();
		        getNewID(conn,user);
		 }
	 }
	 public static void getNewID(Connection conn, UserAccount user) throws SQLException{
		 String sql = "Select a.id from Users a " //
	                + " where a.name = ? and a.startwork= ?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, user.getName());
	        pstm.setString(2, user.getStartWork());
	        ResultSet rs = pstm.executeQuery();

			 System.out.println("GET SUCKSHIT");
	        if (rs.next()) {
	        	String id = rs.getString("id");
				 setCode(conn,id);
	        }

			 
	 }
	 public static void setCode(Connection conn, String id) throws SQLException{
//		 pstm.setString(1, "G"+id);
//		 pstm.setString(2, "1");
//		 pstm.setString(3, id);
//	        pstm = conn.prepareStatement(sql);
//			pstm.executeUpdate();
			 String sql = "Update users set code =?, Status=? where Id=? ";
			 
		        PreparedStatement pstm = conn.prepareStatement(sql);
		 
		        pstm.setString(1, "G"+ id);
		        pstm.setString(2, "1");
		        pstm.setString(3, id);
		        pstm.executeUpdate();
	        System.out.println("Set code SUCKSHIT");
	 }
}