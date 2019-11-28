import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class G14Sum extends JFrame implements ActionListener
{
	JLabel lab1,lab2,lab3;
	JTextField txt1,txt2,txt3;
	JButton but1;
	G14Sum()
	{
		lab1=new JLabel("Enter first number");
		lab2=new JLabel("Enter second number");
		lab3=new JLabel("The sum is");
		txt1=new JTextField(10);
		txt2=new JTextField(10);	
		txt3=new JTextField(10);
		but1=new JButton("ADD");
		add(lab1); add(txt1);
		add(lab2); add(txt2);
		add(but1);
		add(lab3); add(txt3);

		but1.addActionListener(this);
	
		setLayout(new FlowLayout());
		setSize(600,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt( txt1.getText() );
		int n2=Integer.parseInt( txt2.getText() );
		int r=n1+n2;
		txt3.setText(r+"");
	}
	public static void main(String arg[])
	{
		new G14Sum();
	}
}