import java.sql.*;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

class ComboWithDB extends JFrame{


	static JFrame f; 
   
    static JLabel l, l1; 
      
    static JComboBox c1,c2;



    public static void main(String[] args) 
    { 
    	String[] s1 = new String[5];
    	String[] s2 = new String[7];

        
        f = new JFrame("frame"); 
         
        ComboWithDB s = new ComboWithDB();
        f.setLayout(new FlowLayout()); 
  
        // array of string contating cities 
       int count=0;



  		try{
  			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root123");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select distinct state from tblStateCity ");
    	    ResultSet rs = st.executeQuery();

    	  

    	    
    	    int i=0;
    	    while(rs.next()){
       			
    	      	s1[i] = rs.getString("state");
        		 i++;
     		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}

        
        c1 = new JComboBox(s1);
        c1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){

            String s= ae.getSource().toString();
            System.out.println(s);
            try{
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root123");
        PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select city from tblStateCity where state=? ");
        st.setString(1,s);
        ResultSet rs = st.executeQuery();          
          int i=0;
          while(rs.next()){
            
              s2[i] = rs.getString("city");
             i++;
        }
      }catch(Exception e){
        e.printStackTrace();
      }


          }
        });
        
        c2 = new JComboBox(s2);
        l = new JLabel("Select your state ");
        l1 = new JLabel("Select your city ");
  		 

  		JPanel p = new JPanel();

  		p.add(l); 
  
        p.add(c1); 


  		p.add(l1); 
  
        p.add(c2); 

        f.add(p);
        
        f.setSize(400, 300); 
  
        f.show(); 
    }  
} 