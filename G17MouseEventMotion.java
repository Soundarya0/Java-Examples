import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class G17MouseEventMotion extends JFrame implements MouseListener, MouseMotionListener
{
	G17MouseEventMotion()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setLayout(null);
		setSize(600,400);
		setVisible(true);
	}
	public void mouseMoved(MouseEvent me)
	{
		System.out.println("moving...");
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("dragged....");
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("entered");
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("exited");
	}
	public void mousePressed(MouseEvent me)
	{
		System.out.println("pressed");
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("released");
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("clicked");
	}
	public static void main(String arg[])
	{
		new G17MouseEventMotion();
	}
}