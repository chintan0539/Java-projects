
/*
	<APPLET CODE="AppletSum.class" width="300" height="200">
	</APPLET>
*/

	import java.awt.*;
	import java.applet.*;
	import java.awt.event.*;


	public class AppletSum extends Applet implements ActionListener
	{
		TextField t1,t2,out;
		Label l1,l2,l3;
		Button button,btnsub,btnmulti,btndiv;

		public void init()
		{
			setLayout(null);
			l1=new Label("Enter no 1 ");
			l1.setBounds(20,20,100,20);
			add(l1); 
			
			t1=new TextField();
			t1.setBounds(150,20,100,20);
			add(t1);


			l2=new Label("Enter no 2 ");
			l2.setBounds(20,50,100,20);
			add(l2);

			t2=new TextField();
			t2.setBounds(150,50,100,20);
			add(t2);


			l3=new Label("Answer is ");
			l3.setBounds(20,80,130,20);
			add(l3);

			out=new TextField();
			out.setBounds(150,80,100,20);
			add(out);

			button=new Button("Sum");
			button.setBounds(20,110,40,20);
			add(button);
			button.addActionListener(this);

			btnsub=new Button("Sub");
			btnsub.setBounds(80,110,40,20);
			add(btnsub);
			btnsub.addActionListener(this);

			btnmulti=new Button("MUL");
			btnmulti.setBounds(140,110,40,20);
			add(btnmulti);
			btnmulti.addActionListener(this);

			btndiv=new Button("Div");
			btndiv.setBounds(200,110,40,20);
			add(btndiv);
			btndiv.addActionListener(this);
		}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==button)
			{
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int sum=num1+num2;
				out.setText(Integer.toString(sum));
				
			}

			if(ae.getSource()==btnsub)
			{
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int sum=num1-num2;
				out.setText(Integer.toString(sum));
				
			}

			if(ae.getSource()==btnmulti)
			{
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int sum=num1*num2;
				out.setText(Integer.toString(sum));
				
			}

			if(ae.getSource()==btndiv)
			{
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int sum=num1/num2;
				out.setText(Integer.toString(sum));
				
			}
		}
	}