import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 */
class ButtonEventHandling extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4;
	TextField tf1,tf2,tf3;
	ButtonEventHandling(int w,int h)
	{
		b1=new JButton("sum");
		b2=new JButton("product");
		b3=new JButton("differnce");
		b4=new JButton("quotient");
		tf1=new TextField(5);
		tf2=new TextField(5);
		tf3=new TextField(6);
		add(tf1);
		add(tf2);
		add(b1); add(b2); add(b3); add(b4);
		add(tf3);
		//add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(tf1.getText());
		int n2=Integer.parseInt(tf2.getText());
		JButton b=(JButton)ae.getSource();

		int r=0;
		if(b==b1) r=n1+n2;
		else if(b==b2) r=n1*n2;
		else if(b==b3) r=n1>n2?n1-n2:n2-n1;
		else if(b==b4) r=n1/n2;

		tf3.setText(r+"");
	}
}
class GuiCalculateWithinFrame
{
	public static void main(String arg[])
	{		
		ButtonEventHandling beh=new ButtonEventHandling(700,400);
	}
}