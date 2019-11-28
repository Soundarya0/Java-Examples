import java.awt.*;
class Box extends Frame
{
}
class GuiWindows
{
	public static void main(String arg[]) 
	{
		Box b1=new Box();
		Box b2=new Box();		
		Box b3=new Box();
		b1.setSize(500,400);
		b2.setSize(500,400);
		b3.setSize(700,200);
		b1.setLocation(50,50);
		b2.setLocation(600,50);
		b3.setLocation(200,500);
		b1.setTitle("first");
		b2.setTitle("second");
		b3.setTitle("third");
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
	}
}