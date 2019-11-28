import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Box extends JFrame implements ActionListener
{
	JButton b1,b2;
	Box()
	{
		b1=new JButton("OK");
		b2=new JButton("Cancel");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		setLayout(new FlowLayout());
		setSize(1000,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		setTitle("first button pressed");
	}
}
class Swing3
{
	public static void main(String arg[])
	{
		new Box();
	}
}