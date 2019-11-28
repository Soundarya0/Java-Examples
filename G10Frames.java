import javax.swing.*;
import java.awt.*;
class First extends JFrame
{
	First()
	{
		setSize(400,300);
		setVisible(true);
	}
}
class Second extends JFrame
{
	Second()
	{
		setSize(300,500);
		setVisible(true);
	}
}

class G10Frames
{
	public static void main(String arg[])
	{
		new First();
		new Second();
	}
}