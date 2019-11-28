import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 */
class MouseHandler implements MouseListener
{
	public void mouseEntered(MouseEvent me)
	{	System.out.println("entered at"+me.getX()+","+me.getY());
	}
	public void mouseExited(MouseEvent me)
	{	System.out.println("exited at"+me.getX()+","+me.getY());
	}
	public void mousePressed(MouseEvent me)
	{	System.out.println("pressed at"+me.getX()+","+me.getY());
	}
	public void mouseReleased(MouseEvent me)
	{	System.out.println("released at"+me.getX()+","+me.getY());
	}
	public void mouseClicked(MouseEvent me)
	{	System.out.println("clicked at"+me.getX()+","+me.getY());
	}
}
class OurFrame extends JFrame
{
	OurFrame(int w,int h)
	{
		addMouseListener(new MouseHandler());
		//addMouseMotionListener(this);
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}	
	/*public void mouseMoved(MouseEvent me)
	{	System.out.println("moved at"+me.getX()+","+me.getY());
	}
	public void mouseDragged(MouseEvent me)
	{	System.out.println("dragged at"+me.getX()+","+me.getY());
	}*/
}
class GuiMouseHandlingOutsideClass
{
	public static void main(String arg[])
	{		
		new OurFrame(700,400);
	}
}