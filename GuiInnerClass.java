import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 */
class OurFrame extends JFrame
{
	JButton b1,b2;
	OurFrame(int w,int h)
	{
		add(b1=new JButton("first"));
		add(b2=new JButton("second"));
		ButtonHandler bh=new ButtonHandler();
		b1.addActionListener(bh);
		b2.addActionListener(bh);
		
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}
	class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			  System.out.println("first button clicked");
			else
			  System.out.println("second button clicked");
		}
	}		
}
class GuiInnerClass
{
	public static void main(String arg[])
	{		
		new OurFrame(700,400);
	}
}