import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class G15SumExHand extends JFrame implements ActionListener
{
	JLabel lab1,lab2,lab3;
	JTextField txt1,txt2,txt3;
	JButton but1;
	G15SumExHand()
	{
		lab1=new JLabel("number 1");
		lab2=new JLabel("number 2");
		lab3=new JLabel("sum is");
		txt1=new JTextField(10);
		txt2=new JTextField(10);	
		txt3=new JTextField(10);
		but1=new JButton("ADD");
		add(lab1); add(txt1);
		add(lab2); add(txt2);
		add(but1);
		add(lab3); add(txt3);

		but1.addActionListener(this);
	
		lab1.setBounds(50,50,150,25);
		lab2.setBounds(50,80,150,25);
		lab3.setBounds(50,150,150,25);
		txt1.setBounds(200,50,150,25);
		txt2.setBounds(200,80,150,25);
		txt3.setBounds(200,150,350,25);
		but1.setBounds(150,110,150,25);

		lab1.setFont( new Font("verdana",1,20) );
		lab2.setFont( new Font("verdana",1,20) );
		lab3.setFont( new Font("verdana",1,20) );
		txt1.setFont( new Font("verdana",1,20) );
		txt2.setFont( new Font("verdana",1,20) );
		txt3.setFont( new Font("verdana",1,20) );
		but1.setFont( new Font("verdana",1,20) );

		setLayout(null);
		setSize(600,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try{
		int n1=Integer.parseInt( txt1.getText() );
		int n2=Integer.parseInt( txt2.getText() );
		int r=n1+n2;
		txt3.setText(r+"");
		}catch(Exception ee){
			txt3.setText("data missing (or) invalid data");
		}		
	}
	public static void main(String arg[])
	{
		new G15SumExHand();
	}
}