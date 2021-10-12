import java.awt.*;
import java.awt.event.*;


class Per extends Frame implements ActionListener{
	TextField m1,m2,m3,av,pe;
	 Per(){
	 	setLayout(null);
	 	setSize(300,300);
	 	setVisible(true);
	 	Label nm=new Label("name");
		nm.setBounds(20,40,30,20);
		add(nm);

		Label mk1=new Label("m1");
		mk1.setBounds(20,60,30,20);
		add(mk1);


		Label mk2=new Label("m2");
		mk2.setBounds(20,80,30,20);
		add(mk2);

		Label mk3=new Label("m3");
		mk3.setBounds(20,100,30,20);
		add(mk3);


		TextField name=new TextField();
		name.setBounds(50,40,90,20);
		add(name);

		 m1=new TextField();
		m1.setBounds(50,60,90,20);
		add(m1);

		 m2=new TextField();
		m2.setBounds(50,80,90,20);
		add(m2);

		 m3=new TextField();
		m3.setBounds(50,100,90,20);
		add(m3);

		Button bcal=new Button("Calculate");
		bcal.setBounds(50,150,70,30);
		add(bcal);


		av=new TextField();
		av.setBounds(50,180,90,20);
		add(av);

		pe=new TextField();
		pe.setBounds(50,210,90,20);
		add(pe);



		bcal.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae){

		float a=Float.parseFloat(m1.getText());
		float b=Float.parseFloat(m2.getText());
		float c=Float.parseFloat(m3.getText());


		float ave=(a+b+c);

		float percent=(ave/300)*100;

		av.setText(Float.toString(ave));
		pe.setText(Float.toString(percent));

	}


	 


	 public static void main(String args[]){
	 	Per a=new Per();
	 }
}