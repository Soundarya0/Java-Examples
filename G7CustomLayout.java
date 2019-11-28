import javax.swing.*;
import java.awt.*;
class Win extends JFrame
{
	JButton b1,b2,b3,b4,b5;
	Win()
	{
		b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");
		b4=new JButton("Fourth");
		b5=new JButton("Fifth");
		add(b1);
		add(b2);
		add(b3);	
		add(b4);
		add(b5);
		b1.setBounds(50,50,100,20);
		b2.setBounds(50,100,200,50);
		b3.setBounds(500,400,80,15);
		b4.setBounds(300,100,100,200);
		b5.setBounds(10,400,80,60);
		setLayout(null);
		setSize(600,500);
		setVisible(true);
	}
}

class G7CustomLayout
{
	public static void main(String arg[])
	{
		new Win();
	}
}