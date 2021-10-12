//Insert record
//The PreparedStatement interface is a subinterface of Statement. 
//It is used to execute parameterized query.

/*
Improves performance: The performance of the application will be faster 
if you use PreparedStatement interface because query is compiled only once.

*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;
 
public class InsertRecord
{
    public static void main(String[] args) 
{
 
        // creates three different Connection objects
        Connection conn = null;
        

 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/dbmastdetail";
            String user = "root";
            String password = "admin";
 
            conn = DriverManager.getConnection(url1, user, password);

           

           PreparedStatement stmt=conn.prepareStatement("insert into tbldept values(?,?,?)");  
		
		stmt.setInt(1,40);//1 specifies the first parameter in the query  
		stmt.setString(2,"Purchase");  
                stmt.setString(3,"Banglore");
		int i=stmt.executeUpdate();  
		
		System.out.println(i+" Record Inserted");  
  
		conn.close();  
  
   
 
            
        } 
	catch (SQLException ex) 
	{
            System.out.println("An error occurred. Maybe user/password is invalid");
           // ex.printStackTrace();
        }

        finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
}

    }
}

