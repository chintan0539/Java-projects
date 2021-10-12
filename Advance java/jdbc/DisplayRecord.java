//Display record

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;
 
public class DisplayRecord
{
    public static void main(String[] args) 
{
 
        // creates three different Connection objects
        Connection conn = null;
        Statement stmt = null;

 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/dbMastDetail";
            String user = "root";
            String password = "root123";
 
            conn = DriverManager.getConnection(url1, user, password);

           

             stmt = conn.createStatement();

      String sql = "SELECT deptno,dname,location from tbdept";
      ResultSet rs = stmt.executeQuery(sql);
      
    //STEP 5: Extract data from result set

        System.out.println("Dept No\t Dname\t Location");
      while(rs.next())
      {
         //Retrieve by column name
         int deptno  = rs.getInt("deptno");
         
         String dname = rs.getString("dname");
         String location = rs.getString("location");

         //Display values
       
         System.out.println(deptno+"\t"+dname+"\t"+location);
         
         
      }
      rs.close();


 
            
        } 
	catch (Exception ex) 
	{
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
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

