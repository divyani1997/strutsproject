package portal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EmployeeLoginDao {
	private String username;
	  private String password;
	
	  public String getUsername()
	  {
	   return username;
	    }
	  public void setUsername(String username)
	  {
	   this.username = username;
	   }
	  public String getPassword()
	  {
	   return password;
	   }
	  public void setPassword(String password)
	  {
	   this.password = password;
	   }
	  public String execute()
	  {
	   String result="error";
	   Connection connection=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence", "root", "dinku");
		String sql = "SELECT name FROM employee WHERE username = ? AND pass = ? ";
	     
	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);
	            ResultSet resultset = preparedStatement.executeQuery();
	            while(resultset.next())
	              {
	              result="success";
	              }//while
	             } //try
	             catch (Exception e)
	             {
	              result ="error";
	              } //catch
	            finally
	            {
	             if (connection != null)
	              {
	               try
	                {
	                 connection.close();
	                  } //try
	               catch (Exception e)
	               {
	                System.out.println(e);
	                }//catch
	              }//if
	            }//finally
	           return result;
}
		}