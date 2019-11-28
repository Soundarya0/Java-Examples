import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
when we press a Button, an object is created with the details of the click/press.
That object is of type ActionEvent. 
That object is passed to a method named actionPerformed()
The actionPerformed() method should take ActionEvent object as argument.
To receive the ActionEvent object from a Button (by the actionPerformed() method), 
the corresponding object should register with the Button.
The class (of which the registering object belongs to) should implement ActionListener
Any number of objects can register with the Button, so that all such objects 
will receive the ActionEvent object.
*/
class One implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("in one");
	}
}
class Two implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("in two");
	}
}
class EventHandling extends JFrame
{
	JButton but;
	EventHandling(int w,int h)
	{
		but=new JButton("Click Me");
		add(but);
		One one=new One();
		Two two=new Two();
		but.addActionListener(one);
		but.addActionListener(two);
		
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);	
	}
}
class GuiEvent
{
	public static void main(String arg[])
	{		
		new EventHandling(700,400);
	}
}