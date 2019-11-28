import java.awt.*;
import javax.swing.*;
class Unit extends JFrame
{
	Unit(int w,int h, int l,int t,String name)
	{
		JButton b1=new JButton("SWING Button");	
		JButton b2=new JButton("second button");	
		JButton b3=new JButton("third one");	
		JButton b4=new JButton("4th");	
		JButton b5=new JButton("last button");
		add(b1);
		add(b2);		
		add(b3);		
		add(b4);		
		add(b5);
		setLayout(new FlowLayout());
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
	}
}
class GuiButtons
{
	public static void main(String arg[]) 
	{
		Unit u=new Unit(800,600,50,50,"SWING Window");		
	}
}