import java.awt.*;
import javax.swing.*;
class Unit extends JFrame
{
	JButton b[]; //reference to array of JButton references
	Unit(int w,int h, int l,int t,String name)
	{
		b=new JButton[50]; //array of JButton references (50) is created, but the actual JButton objects are not created
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton("button"+(i+1));
			add(b[i]);
		}
		setLayout(new FlowLayout());
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
	}
}
class GuiButtonsArray
{
	public static void main(String arg[]) 
	{
		Unit u=new Unit(800,600,50,50,"SWING Window");		
	}
}