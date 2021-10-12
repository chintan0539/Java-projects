import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class allopeDB extends JFrame implements ActionListener{

	private JTextField codeTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JTextField contactTF;
    
    private JButton addbtn;
    private JButton searchbtn;
    private JButton updatebtn;
    private JButton deletebtn;

    private JLabel title,l1,l2,l3,l4;
    private JPanel panel;



    public static void main(String args[]){
    	try {
            allopeDB frame = new allopeDB();
            frame.setVisible(true);
		} catch (Exception e) {
        	e.printStackTrace();
		}
    }


    allopeDB(){

    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,200,1060,600);
        setResizable(false);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        //TITLE.
        title = new JLabel("CUSTOMER");
        title.setForeground(Color.BLACK);
        title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        title.setBounds(423, 13, 273, 93);
        panel.add(title);

        //LABELS....

       	l1 = new JLabel("Code");
        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l1.setBounds(50, 100, 100, 30);
        panel.add(l1);


        l2 = new JLabel("Name");
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setBounds(50, 150, 100, 30);
        panel.add(l2);


        l3 = new JLabel("Address");
        l3.setBackground(Color.BLACK);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setBounds(50, 200, 100, 30);
        panel.add(l3);


        l4 = new JLabel("Contact");
        l4.setBackground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l4.setBounds(50, 250, 100, 30);
        panel.add(l4);




        //TEXTFIELDS....

        codeTF = new JTextField();
        codeTF.setColumns(10);
        codeTF.setForeground(Color.BLACK);
        codeTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
        codeTF.setBounds(150, 100, 200, 30);
        panel.add(codeTF);

        nameTF = new JTextField();
        nameTF.setColumns(10);
        nameTF.setForeground(Color.BLACK);
        nameTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
        nameTF.setBounds(150, 150, 200, 30);
        panel.add(nameTF);

		addressTF = new JTextField();
        addressTF.setColumns(10);
        addressTF.setForeground(Color.BLACK);
        addressTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
        addressTF.setBounds(150, 200, 200, 30);
        panel.add(addressTF);

       	contactTF = new JTextField();
      	contactTF.setColumns(10);
      	contactTF.setForeground(Color.BLACK);
      	contactTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
      	contactTF.setBounds(150, 250, 200, 30);
        panel.add(contactTF);




        // BUTTONS

        addbtn = new JButton("Add");
        addbtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
        addbtn.setBounds(100, 400, 150, 73);
        panel.add(addbtn);
        addbtn.addActionListener(this);

		searchbtn = new JButton("Search");
        searchbtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
        searchbtn.setBounds(350, 400, 150, 73);
        panel.add(searchbtn);

        updatebtn = new JButton("Update");
        updatebtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
        updatebtn.setBounds(600, 400, 150, 73);
        panel.add(updatebtn);
        updatebtn.addActionListener(this);



        deletebtn = new JButton("Delete");
        deletebtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
        deletebtn.setBounds(850, 400, 150, 73);
        panel.add(deletebtn);
        deletebtn.addActionListener(this);


    }

    //ONCLICK

    public void actionPerformed(ActionEvent ae){

    	String code=codeTF.getText();
    	String name=nameTF.getText();
    	String address=addressTF.getText();
    	String contact=contactTF.getText();

    	 

    	if (ae.getSource()==addbtn) {
    		try{
    			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DBcust","root", "root123");
    			PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT INTO custDetail VALUES(?,?,?,?)");
    			st.setInt(1,Integer.parseInt(code));
    			st.setString(2, name);
    			st.setString(3, address);
    			st.setDouble(4,Integer.parseInt(contact));

    			st.executeUpdate();

    			JOptionPane.showMessageDialog(addbtn, "Customer added successfully");
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}


    	if (ae.getSource()==deletebtn) {
    		try{
    			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DBcust","root", "root123");
    			PreparedStatement st = (PreparedStatement) connection.prepareStatement("DELETE FROM custDetail WHERE code=?");
    			st.setInt(1,Integer.parseInt(code));
    			
    			st.executeUpdate();

    			JOptionPane.showMessageDialog(deletebtn, "Customer deleted successfully");
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}

    	if (ae.getSource()==updatebtn) {
    		try{
    			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DBcust","root", "root123");
    			PreparedStatement st = (PreparedStatement) connection.prepareStatement("UPDATE custDetail SET name=?,address=?,contact=? WHERE code=?");
    			st.setString(1, name);
    			st.setString(2, address);
    			st.setString(3, contact);
    			st.setInt(4,Integer.parseInt(code));

    			
    			st.executeUpdate();

    			JOptionPane.showMessageDialog(deletebtn, "CustomerUpdated successfully");
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}


    	if (ae.getSource()==searchbtn) {
    		try{
    			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DBcust","root", "root123");
    			PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT * FROM custDetail WHERE code=?");
    			st.setInt(1,Integer.parseInt(code));
    			
    			st.executeQuery();

    			JOptionPane.showMessageDialog(deletebtn, "Customer deleted successfully");
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}






    }

}