import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 */
class OurFrame extends JFrame implements MouseListener
{
	OurFrame(int w,int h)
	{
		addMouseListener(this);
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}	
	public void mouseEntered(MouseEvent me)
	{	System.out.println("entered");
	}
	public void mouseExited(MouseEvent me)
	{	System.out.println("exited");
	}
	public void mousePressed(MouseEvent me)
	{	System.out.println("pressed");
	}
	public void mouseReleased(MouseEvent me)
	{	System.out.println("released");
	}
	public void mouseClicked(MouseEvent me)
	{	System.out.println("clicked");
	}
}
class GuiMouseEvents
{
	public static void main(String arg[])
	{		
		new OurFrame(700,400);
	}
}