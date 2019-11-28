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
	ButtonEventHandling beh;
	One(ButtonEventHandling frameReference)
	{
		beh=frameReference;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(beh.b1.getText().equals("one"))
		  beh.b1.setText("first");		
		else
		  beh.b1.setText("one");
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
	JButton but,b1,b2;
	
	ButtonEventHandling(int w,int h)
	{
		but=new JButton("Click Me");
		b1=new JButton("one");
		b2=new JButton("two");
		//b1.setText("ONE");
		add(but);
		add(b1);
		add(b2);
		but.addActionListener(new One(this));
		but.addActionListener(new Two(this));
		
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);	
	}
}
class GuiEventHandling
{
	public static void main(String arg[])
	{		
		ButtonEventHandling beh=new ButtonEventHandling(700,400);
	}
}