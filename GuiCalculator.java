import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 */
/*class Operation implements ActionListener
{
}*/
class ButtonEventHandling extends JFrame implements ActionListener
{
	
	JButton  b[], bp,bm,bs,bd,be;
	TextField tf1,tf2,tf3;
	int op=0;
	ButtonEventHandling()
	{	b=new JButton[10];
		for(int i=0;i<10;i++)
		{
		b[i]=new JButton(i+"");
		add(b[i]);
		b[i].addActionListener(this);	  
		}
		bp=new JButton("+");
		bs=new JButton("-");
		bm=new JButton("*");
		bd=new JButton("/");
		be=new JButton("=");
		tf1=new TextField(5);
		tf2=new TextField(5);
		tf3=new TextField(6);
		add(bp); add(bs); add(bm); add(bd);
		add(be);
		add(tf1);
		add(tf2);
		add(tf3);
		//JButton e=(JButton)ae.getSource();
		//if(e==b[i])
		//b0.addActionListener(this);
	/*	b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);*/
		bp.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		be.addActionListener(this);
		bd.addActionListener(this);
		setLayout(new FlowLayout());
		setSize(200,300);
		setTitle("calculator..");
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		JButton e=(JButton)ae.getSource();
		for(int i=0;i<10;i++){
		if(e==b[i]){
		if(op==0){tf1.setText(i+"");}
		else{tf2.setText(i+"");}
		                   }               }
		 if(e==bp){op=1;}
		else if(e==bs){op=2;}
		else if(e==bm){op=3;}
		else if(e==bd){op=4;}
		else if(e==be){
		int n1=Integer.parseInt(tf1.getText());
		int n2=Integer.parseInt(tf2.getText());
		//JButton b=(JButton)ae.getSource();

		int r=0;
		if(op==1) r=n1+n2;
		else if(op==3) r=n1*n2;
		else if(op==2) r=n1>n2?n1-n2:n2-n1;
		else if(o==4) r=n1/n2;

		tf3.setText(r+"");
			}
	
}  }
class GuiCalculator
{
	public static void main(String arg[])
	{		
		ButtonEventHandling beh=new ButtonEventHandling();
	}
}