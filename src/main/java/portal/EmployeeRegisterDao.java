package portal;
import java.sql.*;
public class EmployeeRegisterDao {
	public static int save(EmployeeRegister r){  
		int status=0;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence", "root", "dinku");
		  
		PreparedStatement ps=con.prepareStatement("insert into employee(empname,DOB,address,mobile,gender,username,pass) values(?,?,?,?,?,?,?)");  
		ps.setString(1,r.getEmpname());  
		ps.setString(2,r.getDOB());  
		ps.setString(3,r.getAddress());  
		ps.setString(4,r.getMobile());  
		ps.setString(6,r.getGender());  
		ps.setString(7,r.getUsername());  
		ps.setString(8,r.getPassword());            
		status=ps.executeUpdate();  
		  
		}catch(Exception e){e.printStackTrace();}  
		    return status;  
		}  

}
