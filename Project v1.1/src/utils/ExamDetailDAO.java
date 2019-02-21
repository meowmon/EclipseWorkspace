package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.Department;
public class ExamDetailDAO {
	 public static List<Department> queryDepartment(Connection conn) throws SQLException {
	        String sql = "Select a.Id, a.Name, a.Status from khoa a ";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        ResultSet rs = pstm.executeQuery();
	        List<Department> list = new ArrayList<Department>();
	        while (rs.next()) {
	            String id = rs.getString("Id");
	            String name = rs.getString("Name");
	            String status = rs.getString("Status");
	            System.out.println(id+name+status);
	            Department department = new Department();
	            department.setId(id);
	            department.setName(name);
	            department.setStatus(status);
	            list.add(department);
	        }
	        return list;
	    }
	 public static Department findDepartment(Connection conn, String id) throws SQLException {
	        String sql = "Select a.Id, a.Name, a.Status from khoa a where a.Id=?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, id);
	 
	        ResultSet rs = pstm.executeQuery();
	 
	        while (rs.next()) {
	            String name = rs.getString("Name");
	            String status = rs.getString("Status");
	            Department department = new Department(id, name, status);
	            return department;
	        }
	        return null;
	    }
	 
	    public static void updateDepartment(Connection conn, Department department) throws SQLException {
	        String sql = "Update khoa set Name =?, Status=? where Id=? ";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, department.getName());
	        pstm.setString(2, department.getStatus());
	        pstm.setString(3, department.getId());
	        pstm.executeUpdate();
	    }
	 
	    public static void insertDepartment(Connection conn, Department department) throws SQLException {
	        String sql = "Insert into khoa( Name, Status) values (?,?)";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, department.getName());
	        pstm.setString(2, department.getStatus());
	 
	        pstm.executeUpdate();
	    }
	 
	    public static void deleteDepartment(Connection conn, String id) throws SQLException {
	        String sql = "Delete From khoa where Id= ?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	 
	        pstm.setString(1, id);
	 
	        pstm.executeUpdate();
	    }
	 
}
