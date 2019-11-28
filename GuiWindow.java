import java.awt.*;

class GuiWindow
{
	public static void main(String arg[]) 
	{
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(500,400); 
		f.setLocation(200,400); // 200px from left, 400px from top
		f.setTitle("Our Window");
	}
}