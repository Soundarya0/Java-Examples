import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Upper extends Thread
{
	JTextArea t1;
	Upper(JTextArea t1)
	{
		this.t1=t1;
		start();
	}
	public void run()
	{		
		String s="";
		for(int i=65; i<=90; i++)
		{
			s+= (char)i+" ";
			t1.setText(s);
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}

class Lower extends Thread
{
	JTextArea t2;
	Lower(JTextArea t2)
	{
		this.t2=t2;
		start();
	}
	public void run()
	{		
		String s="";
		for(int i=97; i<=122; i++)
		{
			s+= (char)i+" ";
			t2.setText(s);
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}

class G19Alphabets extends JFrame  implements ActionListener
{
	JTextArea t1,t2;
	JButton b1;
	G19Alphabets()
	{
		t1=new JTextArea();
		t2=new JTextArea();
		b1=new JButton("start Printing...");
		add(t1);
		add(t2);
		add(b1);
		t1.setBounds(50,50,800,200);
		t2.setBounds(50,300,800,200);
		b1.setBounds(50,550,250,30);
		t1.setFont( new Font("verdana",1,20) );
		t2.setFont( new Font("verdana",1,20) );
		b1.setFont( new Font("verdana",1,20) );

		b1.addActionListener(this);
		setLayout(null);
		setSize(1000,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Upper u=new Upper(t1);
		Lower l=new Lower(t2);
	}
	public static void main(String arg[])
	{
		new G19Alphabets();
	}
}