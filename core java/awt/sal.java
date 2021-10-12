import java.awt.*;
import java.awt.event.*;

class sal extends Frame implements  ActionListener{
		TextField sa,res;

	sal(){


		setLayout(null);
	 	setSize(300,300);
	 	setVisible(true);

		Label nm=new Label("name");
		nm.setBounds(20,40,30,20);
		add(nm);

		TextField name=new TextField();
		name.setBounds(50,40,90,20);
		add(name);

		Label s=new Label("Salary");
		s.setBounds(20,60,30,20);
		add(s);

		 sa=new TextField();
		sa.setBounds(50,60,90,20);
		add(sa);


		Label re=new Label("GS=");
		re.setBounds(20,100,30,20);
		add(re);


		res=new TextField();
		res.setBounds(50,100,90,20);
		add(res);


		Button bcal=new Button("Calculate");
		bcal.setBounds(50,150,70,30);
		add(bcal);


		bcal.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){
		

		float a=Float.parseFloat(sa.getText());

		if(a>10000){

			float da=((90/100)*a);
			float hra=((30/100)*a);
			float ta=((20/100)*a);
			float pf=((12/100)*a);

			float gs=(da+hra+ta-pf);

			res.setText(Float.toString(gs));

		}	
	}

	public static void main(String args[]){
	sal z=new sal();
}

}


