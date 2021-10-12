//Search record 

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

public class SearchRecord extends JFrame 
{

    private JTextField txtcode,txtname,txtadd,txtphone;
    
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;

    
    public static void main(String[] args) 
{
        
            
                try {
                    SearchRecord s = new SearchRecord();
                    s.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
         
    }

    
    public SearchRecord()
 {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Customer Master");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 320, 93);
        contentPane.add(lblNewLabel);

        txtcode = new JTextField();
        txtcode.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtcode.setBounds(481, 170, 281, 68);
        contentPane.add(txtcode);
        txtcode.setColumns(10);

        txtname = new JTextField();
        txtname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtname.setBounds(481, 286, 281, 68);
        contentPane.add(txtname);

        JLabel lblcode = new JLabel("Cust Code");
        lblcode.setBackground(Color.BLACK);
        lblcode.setForeground(Color.BLACK);
        lblcode.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblcode.setBounds(250, 166, 193, 52);
        contentPane.add(lblcode);

        JLabel lblname= new JLabel("Password");
        lblname.setForeground(Color.BLACK);
        lblname.setBackground(Color.CYAN);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblname.setBounds(250, 286, 193, 52);
        contentPane.add(lblname);

        btnNewButton = new JButton("Search");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);

        btnNewButton.addActionListener(new ActionListener() {

     public void actionPerformed(ActionEvent e)
 {
                int code = Integer.parseInt(txtcode.getText());
                
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent",
                        "root", "admin");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select code,cname from tblcust where code=?");

                    st.setInt(1, code);
                    
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        
			txtname.setText(rs.getString("cname"));

                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Record Not Found");
			txtcode.setText("");
			txtname.setText("");
			txtcode.grabFocus();
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });

        contentPane.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
    }
}