

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;

import Connection.DBconnection;

public class CustomerMenu extends JFrame implements ActionListener 
{
	JLabel lblid,lblname,lblcontact,lbladdress,lblgender;
	JTextField txtid,txtname,txtcontact,txtaddress;
        JRadioButton r1=new JRadioButton("Male");    
	JRadioButton r2=new JRadioButton("Female"); 
   	JCheckBox c1,c2,c3;
	
	JButton btnnew,btnsave,btnsearch,btndelete,btnreset,btnupdate;
	 Connection con;
	Statement st;
	ResultSet rs;
	
	public CustomerMenu()
	{
		super("Customer Menu");
		
		
		setLayout(null);
		Container container=getContentPane();
		
		lblid=new JLabel("Id:");
		lblid.setBounds(100, 50, 50, 20);
		container.add(lblid);
		
		lblname=new JLabel("Name:");
		lblname.setBounds(100, 80, 50, 20);
		container.add(lblname);
		
		lblcontact=new JLabel("Contact:");
		lblcontact.setBounds(100, 110, 50, 20);
		container.add(lblcontact);
		
		lbladdress=new JLabel("Address:");
		lbladdress.setBounds(100, 140, 50, 20);
		container.add(lbladdress);
                
                r1.setBounds(100,170,70,20);  
  
		r2.setBounds(180,170,70,20);    

	        ButtonGroup bg=new ButtonGroup();  
  
		bg.add(r1);

		bg.add(r2);                   		
		container.add(r1);
		container.add(r2);

		c1=new JCheckBox("c");
   		c2=new JCheckBox("cpp");
   		c3=new JCheckBox("java");

                c1.setBounds(250,170,70,20);  
  		c2.setBounds(320,170,70,20);  
  		c3.setBounds(390,170,70,20);  
  
		container.add(c1);
   		container.add(c2);
		container.add(c3);

		txtid=new JTextField();
		txtid.setBounds(160, 50, 90, 20);
		container.add(txtid);
		
		txtname=new JTextField();
		txtname.setBounds(160, 80, 90, 20);
		container.add(txtname);
		
		txtcontact=new JTextField();
		txtcontact.setBounds(160, 110, 90, 20);
		container.add(txtcontact);
		
		txtaddress=new JTextField();
		txtaddress.setBounds(160, 140, 90, 20);
		container.add(txtaddress);
		
		btnnew=new JButton("New");
		btnnew.setBounds(100, 200,70, 20);
		container.add(btnnew);
		
		btnsave=new JButton("Save");
		btnsave.setBounds(200,200,70,20);
		container.add(btnsave);
		
		btnsearch=new JButton("Search");
		btnsearch.setBounds(100, 240, 90, 20);
		container.add(btnsearch);
		
		btndelete=new JButton("Delete");
		btndelete.setBounds(200, 240, 70, 20);
		container.add(btndelete);
		
		
		btnupdate=new JButton("Update");
		btnupdate.setBounds(300, 200, 90, 20);
		container.add(btnupdate);
		btnupdate.setEnabled(false);
		
		btnreset=new JButton("Reset");
		btnreset.setBounds(280, 240, 70, 20);
		container.add(btnreset);
		
		
		
		
		btnsave.setEnabled(false);
		btndelete.setEnabled(false);
		
		btnnew.addActionListener(this);
		btnsave.addActionListener(this);
		btnsearch.addActionListener(this);
		btndelete.addActionListener(this);
		btnreset.addActionListener(this);
		btnupdate.addActionListener(this);
		
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		if(ae.getSource()==btnnew)
		{
			int id=0;
			btnsearch.setEnabled(false);
			txtid.setEditable(false);
			try
			{
			
                               con=new DBconnection().getConnection();
				st=con.createStatement();
				rs=st.executeQuery("SELECT IFNULL(max(code),0) as maxid FROM tblcust");
				while(rs.next())
				{
					id=rs.getInt("maxid");
				}
				id+=1; //id=id+1;
				txtid.setText(String.valueOf(id));
				btnsave.setEnabled(true);
				btnnew.setEnabled(false);
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "Unable to connect to database");
			}
			
		}
		
		
		if(ae.getSource()==btnsave)
		{
			try
			{
                               String gender="";
			       String course="";
				//RadionButton
				if(r1.isSelected()) 
       				 gender="male";
				else if(r2.isSelected()) 
       				 gender="female";

				//CheckBox

				if(c1.isSelected()) 
       				 course="c";
				if(c2.isSelected()) 
       				 course=course+",cpp";
				if(c3.isSelected()) 
       				 course=course+",java";

				con=new DBConnection().getConnection();
				st=con.createStatement();
				st.executeUpdate("INSERT INTO tblcust VALUES ("+Integer.parseInt(txtid.getText())+",'"+txtname.getText()+"','"+txtaddress.getText()+"','"+txtcontact.getText()+"','"+gender +"','" + course +"')");
				JOptionPane.showMessageDialog(this,"One Record has been saved successfully");
				txtid.setEditable(true);
				txtid.setText("");
				txtname.setText("");
				txtcontact.setText("");
				txtaddress.setText("");
				btnsave.setEnabled(false);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "Unable to connect to database");

			}
		}
		
		if(ae.getSource()==btnsearch)
		{
			
			try
			{
				st=con.createStatement();
				rs=st.executeQuery("SELECT * FROM customer WHERE cid="+Integer.parseInt(txtid.getText())+"");
				if(rs.next())
				{
					btnnew.setEnabled(false);
					//btnsave.setEnabled(true);
					btnupdate.setEnabled(true);
					btndelete.setEnabled(true);
					txtid.setEditable(false);
					txtname.setText(rs.getString("cname"));
					txtcontact.setText(rs.getString("contact"));
					txtaddress.setText(rs.getString("address"));
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Record not found");
					txtname.setText("");
					txtcontact.setText("");
					txtaddress.setText("");
					txtid.grabFocus();
					
				}
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "Unable to connect to database");

			}
		}
		
		
		if(ae.getSource()==btnupdate)
		{
			try
			{
				st=con.createStatement();
				st.executeUpdate("UPDATE customer SET cname='"+txtname.getText()+"',contact='"+txtcontact.getText()+"',address='"+txtaddress.getText()+"' WHERE cid="+Integer.parseInt(txtid.getText())+"");
				JOptionPane.showMessageDialog(this, "Record updated");
				btnupdate.setEnabled(false);
				txtid.setEditable(true);
				txtid.setText("");
				txtname.setText("");
				txtcontact.setText("");
				txtaddress.setText("");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "Unable to connect to database");

			}
			
		}
		
		
		if(ae.getSource()==btndelete)
		{
			try
			{
				st=con.createStatement();
				st.executeUpdate("DELETE FROM customer WHERE cid="+Integer.parseInt(txtid.getText())+"");
				btndelete.setEnabled(false);
				txtid.setEditable(true);
				txtid.setText("");
				txtname.setText("");
				txtcontact.setText("");
				txtaddress.setText("");
				JOptionPane.showMessageDialog(this, "Record deleted");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "Unable to connect to database");

			}
			
		}
		
		
		
		if(ae.getSource()==btnreset)
		{
			txtid.setEditable(true);
			btnnew.setEnabled(true);
			btnsave.setEnabled(false);
			btnsearch.setEnabled(true);
			btnupdate.setEnabled(false);
			txtid.setText("");
			txtname.setText("");
			txtcontact.setText("");
			txtaddress.setText("");
			txtid.grabFocus();
			
		}
		
	}


       public static void main(String args[])
      {
       
       CustomerMenu cm=new CustomerMenu();
			cm.setVisible(true);
			cm.setSize(500, 500);
			cm.setLocation(250, 200);

      }
}