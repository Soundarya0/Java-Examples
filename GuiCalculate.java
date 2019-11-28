import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
when we want to receive ActionEvent from multiple buttons, we should write
addActionListener() on each button. */
class One implements ActionListener
{
	ButtonEventHandling beh;
	One(ButtonEventHandling frameReference)
	{
		beh=frameReference;
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(beh.tf1.getText());
		int n2=Integer.parseInt(beh.tf2.getText());
		JButton b=(JButton)ae.getSource();

		int r=0;
		if(b==beh.b1) r=n1+n2;
		else if(b==beh.b2) r=n1*n2;
		else if(b==beh.b3) r=n1-n2;
		else if(b==beh.b4) r=n1/n2;

		beh.tf3.setText(r+"");
	}
}
class ButtonEventHandling extends JFrame
{
	JButton b1,b2,b3,b4;
	TextField tf1,tf2,tf3;
	ButtonEventHandling(int w,int h)
	{
		b1=new JButton("add");
		b2=new JButton("multiply");
		b3=new JButton("subtract");
		b4=new JButton("divide");
		tf1=new TextField(5);
		tf2=new TextField(5);
		tf3=new TextField(6);
		add(tf1);
		add(tf2);
		add(b1); add(b2); add(b3); add(b4);
		add(tf3);
		//add(b3);
		b1.addActionListener(new One(this));
		b2.addActionListener(new One(this));
		b3.addActionListener(new One(this));
		b4.addActionListener(new One(this));
		
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}
}
class GuiCalculate
{
	public static void main(String arg[])
	{		
		ButtonEventHandling beh=new ButtonEventHandling(700,400);
	}
}