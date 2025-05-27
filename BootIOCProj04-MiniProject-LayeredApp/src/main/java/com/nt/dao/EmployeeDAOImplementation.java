//package com.nt.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.nt.model.Employee;
//
//@Repository("empDAO")
//public class EmployeeDAOImplementation implements IEmployeeDAO {
//	private static final String GET_EMPS_QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?,?) ORDER BY JOB";
//	List<Employee>list=null;{
//	
//	Statement ds = null;
//	Throwable se = null;
//	try(Connection con=ds.getConnection();
//			PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);){
//		
//	
//		//set values to query params
//		String desg1 = null;
//		ps.setString(1, desg1);
//		String desg2 =null;
//		ps.setString(1, desg2);
//		String desg3=null;
//		ps.setString(1, desg3);
//		
//		//Execute the SQL query
//		try(
//				ResultSet rs=ps.executeQuery()){
//			
//			//copy the record of the resultset object to model class obj
//			while(rs.next()) {
//				Employee emp=new Employee();
//				emp.setEid(rs.getInt(1));
//				emp.setEname(rs.getString(2));
//				emp.setDesg(rs.getString(3));
//				emp.setDeptno(rs.getInt(5));
//				emp.getSalary(rs.getFloat(4));
//				list.add(emp);
//			}
//		}
//		
//	}
//	catch(SQLException e) {
//		se.printStackTrace();
//		throw se;
//	}
//	catch(Exception e) {
//		se.printStackTrace();
//		throw se;
//		
//	}
//}
//
//	@Override
//	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
//		
//		return null;
//	}
//
//	@Override
//	public List<Employee> getEmpsByDesgs(String desg1, String desg2, String desg3) {
//		
//		return null;
//	}
//}
//	
//	
//
//	
//

package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImplementation implements IEmployeeDAO {

    private static final String GET_EMPS_QUERY = "SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN (?, ?, ?) ORDER BY JOB";

    @Autowired
    private DataSource dataSource; // Inject DataSource

    @Override
    public List<Employee> getEmpsByDesgs(String desg1, String desg2, String desg3) {
        List<Employee> list = new ArrayList<>();

        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY)) {

            // Set values to query parameters
            ps.setString(1, desg1);
            ps.setString(2, desg2);
            ps.setString(3, desg3);

            // Execute the query
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Employee emp = new Employee();
                    emp.setEid(rs.getInt(1));
                    emp.setEname(rs.getString(2));
                    emp.setDesg(rs.getString(3));
                    emp.setSalary(rs.getFloat(4)); // Fixed incorrect method call
                    emp.setDeptno(rs.getInt(5));
                    list.add(emp);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error retrieving employees", e);
        }
        return list;
    }

    @Override
    public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
        return getEmpsByDesgs(desg1, desg2, desg3);
    }
}









