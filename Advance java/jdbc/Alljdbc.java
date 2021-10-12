import java.sql.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Alljdbc{

	public static void main(String args[]){


		Connection connection=null;
		int dno;
		String dnm;
		String dlo;

		try{

			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmastdetail","root","root123");
				
			PreparedStatement stmt;

			Scanner s=new Scanner(System.in);

			int choice;
			System.out.println("Enter your choice\n\t1 INSERT\n\t2 DELETE\n\t3 Select");

			choice=s.nextInt();

			switch(choice){

				case 1:

					System.out.println("Enter department nos,department name & location");

					dno=s.nextInt();
					dnm=s.next();
					dlo=s.next();

					stmt= connection.prepareStatement("Insert into tbdept values(?,?,?)");

					stmt.setInt(1,dno);
					stmt.setString(2,dnm);
					stmt.setString(3,dlo);

					System.out.println("inserted one row");
					connection.close();
					break;

					case 2:
						System.out.println("Enter deptno of the record to be deleted");
							 dno=s.nextInt();

							 stmt=connection.prepareStatement("Delete from tbdept where depno=?");
							 stmt.setInt(1,dno);
							 System.out.println("Deleted one row");
							 connection.close();
							break;

					case 3:

						System.out.println("deptno  dname  location");
						stmt=connection.prepareStatement("Select * from tbdept");
						dno=stmt.getInt("deptno");
						System.out.println(dno);
						connection.close();
						break;




			}
		}catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
           // ex.printStackTrace();
        }


        finally{
            if (connection != null) {
                try {
                    connection.close();
                }catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
		}
	}

}
