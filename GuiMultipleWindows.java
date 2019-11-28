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
class GuiMultipleWindows
{
	public static void main(String arg[]) 
	{
		Box b1=new Box(500,400,50,50,"first");
		Box b2=new Box(500,400,600,50,"second");		
		Box b3=new Box(700,200,200,500,"third");
	}
}