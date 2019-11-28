import java.awt.*;
import javax.swing.*;
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
		Unit u=new Unit(800,600,50,50,"SWING Window");		
	}
}