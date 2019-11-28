import javax.swing.*;
import java.awt.*;
class First extends JFrame
{
	First(int slno,int x)
	{
		setLocation(x,x);
		setTitle("frame "+slno);
		setSize(400,300);
		setVisible(true);
	}
}
class G11FramesArray
{
	public static void main(String arg[])
	{
		First f[]=new First[10];
		for(int i=0,x=50;i<f.length;i++,x+=30)
		{
			f[i]=new First(i+1,x);
		}
	}
}