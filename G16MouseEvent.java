import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class G16MouseEvent extends JFrame implements MouseListener
{
	G16MouseEvent()
	{
		addMouseListener(this);
		setLayout(null);
		setSize(600,400);
		setVisible(true);
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
		new G16MouseEvent();
	}
}