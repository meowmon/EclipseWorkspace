package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.Disease;
public class DiseaseDAO {
	 public static List<Disease> queryDisease(Connection conn) throws SQLException {
	        String sql = "Select a.Id, a.Name, a.descrip, a.idloaibenh, a.Status from benh a ";
	        int id=0;
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        ResultSet rs = pstm.executeQuery();
	        List<Disease> list = new ArrayList<Disease>();
	        while (rs.next()) {
	        	id++;
	            String idd = rs.getString("Id");
	            String name = rs.getString("Name");
	            String descrip = rs.getString("descrip");
	            String idloaibenh = rs.getString("idLoaiBenh");
	            String status = rs.getString("Status");
	            System.out.println(id+name+status);
	            Disease disease = new Disease();
	            disease.setDiseaseId(idd);
	            disease.setId(id);
	            disease.setName(name);
	            disease.setDescrip(descrip);
	            disease.setDiseaseTypeId(idloaibenh);
	            disease.setStatus(status);
	            list.add(disease);
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
