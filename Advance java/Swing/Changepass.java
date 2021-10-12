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


public class Changepass extends JFrame{

	 private JTextField textField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;



    public static void main(String args[]){
    	 try {
                    Changepass frame = new Changepass();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }


    Changepass(){

    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(490, 200, 1060, 650);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel lblNewLabel = new JLabel("Change Pass");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);


        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textField.setBounds(481, 150, 281, 68);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(481, 266, 281, 68);
        contentPane.add(passwordField);

        confirmPasswordField = new JPasswordField();
       confirmPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        confirmPasswordField.setBounds(481, 382, 281, 68);
        contentPane.add(confirmPasswordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(250, 146, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(250, 266, 193, 52);
        contentPane.add(lblPassword);


        JLabel lblPassword1 = new JLabel("Confirm pass");
        lblPassword1.setForeground(Color.BLACK);
        lblPassword1.setBackground(Color.CYAN);
        lblPassword1.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword1.setBounds(250, 386, 193, 52);
        contentPane.add(lblPassword1);





        btnNewButton = new JButton("CHANGE");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 492, 162, 73);

        btnNewButton.addActionListener(new ActionListener() {

   			public void actionPerformed(ActionEvent e){
                String userName = textField.getText();
                String password = passwordField.getText();
                String chpass=confirmPasswordField.getText();

                if(password.equals(chpass)){

                	try {
                    	Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent","root", "root123");
			            PreparedStatement st = (PreparedStatement) connection.prepareStatement("update tbllogin set upass=? where uname=?");
                    	
                    	st.setString(1, password);
						st.setString(2, userName);
                   	 st.executeUpdate(); 
                    
                    	JOptionPane.showMessageDialog(btnNewButton, "Password saved successfully");
                    
               	 	} catch (SQLException sqlException){
                    sqlException.printStackTrace();
                	}
                }else{
                    	JOptionPane.showMessageDialog(btnNewButton, "Confirm pass");

                }
                
            }
        });

        contentPane.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);

    }
}

