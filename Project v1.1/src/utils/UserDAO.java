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
 
        String sql = "Select a.Code, a.Password, a.Gender from Users a " //
                + " where a.Code = ? and a.password= ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setCode(userName);
            user.setPassword(password);
            user.setGender(gender);
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
	 
	        ResultSet rs = pstm.executeQuery();
	        List<UserAccount> list = new ArrayList<UserAccount>();
	        while (rs.next()) {
	            String id = rs.getString("id");
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
	            users.setCode(code);
	            users.setBoMon(bomon);
	            users.setDateOfBirth(birthday);
	            users.setKhoa(khoa);
	            
	            list.add(users);
	        }
	        return list;
	    }
}