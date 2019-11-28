import java.awt.*;
class Box extends Frame
{
	Box(int w,int h, int l,int t,String name)
	{
		setSize(w,h);
		setLocation(l,t);
		setName(name);
		setVisible(true);	
	}
}
class Unit extends Frame
{
	Unit()
	{
		setSize(200,100);
		setName("unit's object");
		setVisible(true);	
	}
}
class GuiMultipleFrames
{
	public static void main(String arg[]) 
	{
		Box b1=new Box(500,400,50,50,"first");
		Box b2=new Box(500,400,600,50,"second");		
		Unit u1=new Unit();
		Unit u2=new Unit();
	}
}