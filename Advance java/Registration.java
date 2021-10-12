import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

class Registration extends JFrame implements ActionListener {


	public static void main(String[] args) {      
        try {
                Registration frame = new Registration();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
         
    }

    private JPanel contentPanel;
    public JTextField fName,lName,address,pNo;
    public JComboBox city;
    JCheckBox subject1,subject2,subject3;
     JRadioButton male,female;
     ButtonGroup bg;
     JButton submit;



    Registration(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        //********************LABELS************************

        JLabel lblNewLabel = new JLabel("Registration");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 10, 273, 93);
        contentPanel.add(lblNewLabel);



        JLabel lb2NewLabel = new JLabel("FName");
        lb2NewLabel.setForeground(Color.BLACK);
        lb2NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb2NewLabel.setBounds(20, 150, 100, 30);
        contentPanel.add(lb2NewLabel);



		JLabel lb3NewLabel = new JLabel("LName");
        lb3NewLabel.setForeground(Color.BLACK);
        lb3NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb3NewLabel.setBounds(20, 200, 100, 30);
        contentPanel.add(lb3NewLabel);

        JLabel lb4NewLabel = new JLabel("Address");
        lb4NewLabel.setForeground(Color.BLACK);
        lb4NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb4NewLabel.setBounds(20, 250, 100, 30);
        contentPanel.add(lb4NewLabel);


        JLabel lb5NewLabel = new JLabel("Phno");
        lb5NewLabel.setForeground(Color.BLACK);
        lb5NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb5NewLabel.setBounds(20, 300, 100, 30);
        contentPanel.add(lb5NewLabel);



        JLabel lb6NewLabel = new JLabel("City");
        lb6NewLabel.setForeground(Color.BLACK);
        lb6NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb6NewLabel.setBounds(20, 350, 100, 30);
        contentPanel.add(lb6NewLabel);


        JLabel lb7NewLabel = new JLabel("Subjects");
        lb7NewLabel.setForeground(Color.BLACK);
        lb7NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb7NewLabel.setBounds(20, 400, 100, 30);
        contentPanel.add(lb7NewLabel);


        JLabel lb8NewLabel = new JLabel("Gender");
        lb8NewLabel.setForeground(Color.BLACK);
        lb8NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb8NewLabel.setBounds(20, 450, 100, 30);
        contentPanel.add(lb8NewLabel);




        //********************TextFields************************

        fName = new JTextField();
        fName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        fName.setBounds(100, 150, 150, 30);
        contentPanel.add(fName);
        fName.setColumns(15);


        lName = new JTextField();
        lName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lName.setBounds(100, 200, 150, 30);
        contentPanel.add(lName);
        lName.setColumns(15);


        address = new JTextField();
        address.setFont(new Font("Tahoma", Font.PLAIN, 14));
        address.setBounds(100, 250, 150, 30);
        contentPanel.add(address);
        address.setColumns(15);


        pNo = new JTextField();
        pNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pNo.setBounds(100, 300, 150, 30);
        contentPanel.add(pNo);
        pNo.setColumns(15);

// ***********************ComboBox**********************

       
        String s1[] = { "Pune", "Mumbai", "Kolhapur", "Kolkata", "New Delhi" }; 
  
        
        city = new JComboBox(s1);
        city.setFont(new Font("Tahoma", Font.PLAIN, 14));
        city.setBounds(100, 350, 150, 30);
        contentPanel.add(city);



// *********************CheckBox***********************

        subject1 = new JCheckBox("C++");    
        subject1.setBounds(100, 400, 100, 30);
        contentPanel.add(subject1);

        subject2 = new JCheckBox("Java");    
        subject2.setBounds(200,400,100,30);    
        contentPanel.add(subject2);



        subject3 = new JCheckBox("Python");    
        subject3.setBounds(300,400,100,30);    
        contentPanel.add(subject3);
        


//*******************************Radio Btn***********************

		bg=new ButtonGroup();  

        male=new JRadioButton("Male");
        male.setBounds(100, 450, 100, 30);   
		bg.add(male);
		contentPanel.add(male);



		female=new JRadioButton("Female"); 
		female.setBounds(200,450, 100, 30);   
		bg.add(female);  
		contentPanel.add(female);

//*********************************Button*********************

		submit=new JButton("Submit");
		submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        submit.setBounds(400, 250, 150, 30);
        contentPanel.add(submit);


        submit.addActionListener(this);



    }

    public void actionPerformed(ActionEvent ae){
    	String fName=this.fName.getText();
    	String lName=this.lName.getText();
    	String address=this.address.getText();

    	Double pNo=Double.parseDouble(this.pNo.getText());

    	String city=this.city.getSelectedItem().toString();
    	System.out.println(fName);
    	System.out.println(lName);
    	System.out.println(address);
    	System.out.println(city);







    }



}

