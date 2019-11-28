import javax.swing.*;
import java.awt.*;
class Win extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6;
	Win()
	{
		b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");
		b4=new JButton("Fourth");
		b5=new JButton("Fifth");
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5);
		//setLayout(new FlowLayout());
		setSize(600,500);
		setVisible(true);
	}
}
class G6BorderLayout
{
	public static void main(String arg[])
	{
		new Win();
	}
}