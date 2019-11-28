import java.awt.*;
import javax.swing.*;
class Box extends Frame
{
	Box(int w,int h, int l,int t,String name)
	{
		Button b=new Button("AWT Button");	
		add(b);
		setLayout(new FlowLayout());
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
		
	}
}
class Unit extends JFrame
{
	Unit(int w,int h, int l,int t,String name)
	{
		JButton b=new JButton("SWING Button");	
		add(b);
		setLayout(new FlowLayout());
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
	}
}
class GuiAwtSwing
{
	public static void main(String arg[]) 
	{
		Box b=new Box(500,400,50,50,"first with AWT");
		Unit u=new Unit(500,400,600,50,"second with SWING");		
	}
}