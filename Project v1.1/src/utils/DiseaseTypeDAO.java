package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.DiseaseType;
public class DiseaseTypeDAO {
	 public static List<DiseaseType> queryDiseaseType(Connection conn) throws SQLException {
	        String sql = "Select a.Id, a.Name, a.descrip, a.Status from loaibenh a ";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        int id = 0;
	        ResultSet rs = pstm.executeQuery();
	        List<DiseaseType> list = new ArrayList<DiseaseType>();
	        while (rs.next()) {
	        	id++;
	            String idtype = rs.getString("Id");
	            String name = rs.getString("Name");
	            String descrip = rs.getString("Descrip");
	            String status = rs.getString("Status");
	            System.out.println(id+name+status);
	            DiseaseType DiseaseType = new DiseaseType();
	            DiseaseType.setDiseaseTypeId(idtype);
	            DiseaseType.setName(name);
	            DiseaseType.setDescrip(descrip);
	            DiseaseType.setId(id);
	            DiseaseType.setStatus(status);
	            list.add(DiseaseType);
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
