import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ButtonHandler extends Thread implements ActionListener
{
	JLabel labQ;
	String questions[];
	Quiz q;
	ButtonHandler(Quiz q)
	{
		this.q=q;
		this.labQ=q.labQ;
		this.questions=q.questions;
	}
	public void run()
	{
		for(int i=0;i<questions.length;i++)
		{
			labQ.setText(questions[i]);
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton but=(JButton)ae.getSource();
		if(but==q.butStart)
		  start();
		else
		  next move.....
	}
}
class Quiz extends JFrame 
{
	String questions[]={"Who is president of India?", "In which year India got independence?", "Who is the first batsman to score 10000 runs in test cricket?", "Where is Tajmahal?", "What is capital of India?"};
	JLabel labQ;
	JButton butStart,butA,butB,butC,butD;
	ButtonHandler bh;
	Quiz()
	{
		labQ=new JLabel("");
		butStart=new JButton("START");
		butA=new JButton("A");
		butB=new JButton("B");
		butC=new JButton("C");
		butD=new JButton("D");
		labQ.setBounds(50,50,700,100);
		butA.setBounds(50,150,50,20);
		butB.setBounds(150,150,50,20);
		butC.setBounds(250,150,50,20);
		butD.setBounds(350,150,50,20);
		butStart.setBounds(400,200,100,30);
		
		add(labQ);
		add(butStart);
		bh=new ButtonHandler(this);
		butStart.addActionListener(bh);
		butA.addActionListener(bh);
		butB.addActionListener(bh);
		butC.addActionListener(bh);
		butD.addActionListener(bh);
		setLayout(null); setSize(1000,400); setVisible(true);
	}
}
class G20Questions{
	public static void main(String arg[])	{
			new Quiz();
		}
}