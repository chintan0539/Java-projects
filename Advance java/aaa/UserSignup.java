import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class UserSignup extends JFrame implements ActionListener
{

	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btn;
	private JLabel label;
	private JPanel contentPane;

	public static void main(String[] args) {
		try{
        	UserSignup frame = new UserSignup();
        	frame.setVisible(true);
       	}catch (Exception e){
            e.printStackTrace();
       	}
    }


    public UserSignup(){


    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setBounds(500,500,500,500);
    	setResizable(false);
    	contentPane=new JPanel();
    	// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	 setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1=new JLabel("Signup");
        l1.setBounds(200,50,100,100);
        contentPane.add(l1);

        textField = new JTextField();
        textField.setBounds(40,150,200,30);
        // textField.setPlaceholder("username");
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(40,210,200,30);
        // passwordField.setPlaceholder("Password");
        contentPane.add(passwordField);

        btn=new JButton("Signup");
        btn.setBounds(40,300,150,40);

        btn.addActionListener(this);
         contentPane.add(btn);
    }

    public void actionPerformed(ActionEvent ae){


    	String userName = textField.getText().toString();
        String password = passwordField.getText().toString();

       	try{
       		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent","root", "root123");
       		PreparedStatement st = (PreparedStatement) connection.prepareStatement("Insert into tbllogin(uname,upass) values(?,?)");
			st.setString(1, userName);
			st.setString(2, password);
       		PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Commit");
       		st.executeQuery();
			System.out.println("Successfully Signed up");
			dispose();
		}catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}


    }


}