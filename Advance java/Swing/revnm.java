import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 class revnm  extends JFrame{
	JButton b1;
	JTextField input,output;

	revnm(){

		JLabel l1=new JLabel("Enter");
		l1.setBounds(20,30,40,10);
		add(l1);

		setLayout(null);
        setSize(600, 400);
        setVisible(true);
	}

	public static void main(String args[]){

		revnm r=new revnm();
	}

}