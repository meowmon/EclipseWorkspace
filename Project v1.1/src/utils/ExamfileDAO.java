package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.Examfile;
import bean.ExamDetail;
public class ExamfileDAO {
	 public static List<Examfile> queryExamfile(Connection conn) throws SQLException {
	        String sql = "Select a.id ,b.name ,a.idUser, c.name,a.day ,a.Descrip,a.Conclude,a.Status\r\n" + 
	        		"	    	FROM ((hoso a \r\n" + 
	        		"	    	INNER JOIN Users b ON a.idUser = b.id) \r\n" +
	        		"			INNER JOIN Examination c on a.idKyKhamBenh = c.id)"		;
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        int id=0;
	        ResultSet rs = pstm.executeQuery();
	        List<Examfile> list = new ArrayList<Examfile>();
	        while (rs.next()) {
	        	id++;
	            String userId = rs.getString("idUser");
	            String name = rs.getString("b.name");
	            String examId = rs.getString("id");
	            String date = rs.getString("day");
	            String idKyKham = rs.getString("c.name");
	            int status = rs.getInt("Status");
	            System.out.println(id+status);
	            Examfile exam = new Examfile();
	            exam.setId(id);
	            exam.setUserId(userId);
	            exam.setUserName(name);
	            exam.setDate(date);
	            exam.setExamfileId(examId);
                exam.setLydokham(idKyKham);
	            exam.setStatus(status);
	            list.add(exam);
	        }
	        return list;
	    }
	 public static Examfile getInfo(String id,Connection conn)  throws SQLException {
		 String sql = "Select a.id ,b.name ,a.idUser, c.name,a.day ,a.Descrip,a.Conclude,a.Status\r\n" + 
	        		"	    	FROM ((hoso a \r\n" + 
	        		"	    	INNER JOIN Users b ON a.idUser = b.id) \r\n" +
	        		"			INNER JOIN Examination c on a.idKyKhamBenh = c.id) \r\n" +
	        		"			WHERE a.id = ?";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, id);
	        int idi=0;
	        ResultSet rs = pstm.executeQuery();
	        Examfile file = new Examfile();
	        while (rs.next()) {
	        	idi++;
	            String userId = rs.getString("idUser");
	            String name = rs.getString("b.name");
	            String examId = rs.getString("id");
	            String date = rs.getString("day");
	            String idKyKham = rs.getString("c.name");
	            String descrip = rs.getString("descrip");
	            String conclude = rs.getString("conclude");
	            int status = rs.getInt("Status");
	            System.out.println(id+status);
	            file.setId(idi);
	            file.setUserId(userId);
	            file.setUserName(name);
	            file.setDate(date);
	            file.setExamfileId(examId);
	            file.setDescrip(descrip);
	            file.setConclude(conclude);
	            file.setLydokham(idKyKham);
	            file.setStatus(status);
	        }
	        return file;
	 }
	 public static ExamDetail getDetail(String id,Connection conn)  throws SQLException {
		 String sql = "Select a.height, a.weight, a.lefteye, a.righteye , a.beat, a.pressure, a.pclass, a.status\r\n"+
				 	" 				FROM KhamNoiTQ a\r\n"+
				 	"				WHERE a.idHoso = ?";
		 PreparedStatement pstm = conn.prepareStatement(sql);
	     pstm.setString(1, id);
	     ResultSet rs = pstm.executeQuery();
	     ExamDetail detail = new ExamDetail();
	     while(rs.next()) {
	    	 int lefteye = rs.getInt("lefteye");
	    	 int righteye = rs.getInt("righteye");
	    	 int height = rs.getInt("height");
	    	 int weight = rs.getInt("weight");
	    	 int beat= rs.getInt("beat");
	    	 int pressure = rs.getInt("pressure");
	    	 String pclass = rs.getString("pclass");
	    	 detail.setHeight(height);
	    	 detail.setWeight(weight);
	    	 detail.setLeftEye(lefteye);
	    	 detail.setRightEye(righteye);
	    	 detail.setBMI();
	    	 detail.setBeat(beat);
	    	 detail.setPressure(pressure);	
	    	 detail.setPclass(pclass);
	     }
		 return detail;
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
