import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MoveImage extends Thread
{
	JLabel lab;
	MoveImage(JLabel lab)
	{
		this.lab=lab;
		start();
	}
	public void run()
	{
		for(int i=1;i<=300;i++)
		{
			Point p=lab.getLocation();
			p.x++;
			p.y++;
			lab.setLocation(p);
			try{sleep(1);}catch(Exception e){}
		}
	}
}
class G18Image extends JFrame 
{
	JLabel lab;
	G18Image()
	{
		lab=new JLabel( new ImageIcon("small.jpg") );
		lab.setBounds(50,50,365,275);
		add(lab);
		new MoveImage(lab);
		setLayout(null);
		setSize(1000,700);
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new G18Image();
	}
}