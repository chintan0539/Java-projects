package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class DBConnection 
{
	
	static Connection con=null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
               
		 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent",
                     "root", "root123");
               return con;

	}

  
	
}
