import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 */
class MouseHandler extends MouseAdapter
{
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("mouse entered");
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("mouse exited");
	}
}
class MouseMotionHandler extends MouseMotionAdapter
{
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("mouse being dragged");
	}
}
class OurFrame extends JFrame
{
	OurFrame(int w,int h)
	{
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}	
}
class GuiMouseAdapters
{
	public static void main(String arg[])
	{		
		new OurFrame(700,400);
	}
}