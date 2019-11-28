import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Box extends JFrame implements ActionListener
{
	JLabel lab;
	JButton b1,b2;
	Box()
	{
		b1=new JButton("OK");
		b2=new JButton("Cancel");
		lab=new JLabel("press a button to see effect here");
		add(b1);
		add(b2);
		add(lab);
		b1.setFont( new Font("verdana",0,40) );
		b2.setFont( new Font("verdana",0,40) );
		lab.setFont( new Font("verdana",0,40) );
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new FlowLayout());
		setSize(600,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton pb=(JButton)ae.getSource();
		if(pb==b1)
		  lab.setText("first button pressed");
		else
		  lab.setText("second button pressed");
	}
}
class Swing4
{
	public static void main(String arg[])
	{
		new Box();
	}
}