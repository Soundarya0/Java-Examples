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
		JButton but=(JButton)ae.getSource();
		String button="";
		if(but==beh.b1)
		  button="one";
		else if(but==beh.b2)
		  button="two";
		else 
		  button="three";
		  
		System.out.println("button "+button+" clicked");
	}
}
class Two implements ActionListener
{
	ButtonEventHandling f;
	Two(ButtonEventHandling frameReference)
	{
		f=frameReference;
	}
	public void actionPerformed(ActionEvent ae)
	{
		f.b2.setText( f.b2.getText()+" two" );
	}
}
class ButtonEventHandling extends JFrame
{
	JButton b1,b2,b3;
	
	ButtonEventHandling(int w,int h)
	{
		b1=new JButton("one");
		b2=new JButton("two");
		b3=new JButton("three");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(new One(this));
		b2.addActionListener(new One(this));
		b3.addActionListener(new One(this));
		
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}
}
class GuiEventHandlingButton
{
	public static void main(String arg[])
	{		
		ButtonEventHandling beh=new ButtonEventHandling(700,400);
	}
}