import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 */
class WindowHand implements WindowListener
{
	public void windowOpened(WindowEvent me)
	{
		System.out.println("window created");
	}
	public void windowClosing(WindowEvent me)
	{
		System.out.println("closing");
		System.exit(0);
	}
	public void windowClosed(WindowEvent me)
	{
		System.out.println("closed");
	}
	public void windowIconified(WindowEvent me)
	{
		System.out.println("minimized");
	}
	public void windowDeiconified(WindowEvent me)
	{
		System.out.println("Restored/normal size");
	}
	public void windowActivated(WindowEvent me)
	{
		System.out.println("control in frame window");
	}
	public void windowDeactivated(WindowEvent me)
	{
		System.out.println("Other window activated");
	}
}
class OurFrame extends JFrame
{
	OurFrame(int w,int h)
	{
		addWindowListener(new WindowHand());
		setLayout(new FlowLayout());
		setSize(w,h);
		setVisible(true);
	}	
}
class GuiWindowEvents
{
	public static void main(String arg[])
	{		
		new OurFrame(700,400);
	}
}