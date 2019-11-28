/*sainath2011mudiraj@gmail.com
akhileshsai09@gmail.com
sony7678@gmail.com
polaharishcool@gmail.com
*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Box extends JFrame implements ActionListener,ItemListener
{
	JLabel lab1,lab2,lab3;
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2,rb3;
	JButton b1,b2;
	ButtonGroup bg;
	Box()
	{
		lab1=new JLabel("Languages known:");
		cb1=new JCheckBox("C-language");
		cb2=new JCheckBox("Java");
		cb3=new JCheckBox("C#.net");
		add(lab1);
		add(cb1);
		add(cb2);
		add(cb3);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);

		lab2=new JLabel("City you like");
		rb1=new JRadioButton("Hyderabad");
		rb2=new JRadioButton("Bengaluru");
		rb3=new JRadioButton("New Delhi");
		bg=new ButtonGroup();
		//add(bg);
		add(lab2);
		add(rb1);
		add(rb2);
		add(rb3);
		bg.add(rb1); bg.add(rb2); bg.add(rb3);

		b1=new JButton("Select All");
		b2=new JButton("Clear All");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);

		lab3=new JLabel("event on checkbox is reflected here");
		add(lab3);

		lab1.setFont( new Font("verdana",0,40) );
		lab2.setFont( new Font("times new roman",0,40) );
		lab3.setFont( new Font("monotype corsiva",0,40) );
		cb1.setFont( new Font("verdana",0,40) );
		cb2.setFont( new Font("verdana",0,50) );
		cb3.setFont( new Font("verdana",0,60) );
		rb1.setFont( new Font("verdana",0,40) );
		rb2.setFont( new Font("verdana",1,40) );
		rb3.setFont( new Font("verdana",2,40) );


		lab1.setBounds(50,50,400,50);
		cb1.setBounds(500,50,300,50);
		cb2.setBounds(500,100,300,50);
		cb3.setBounds(500,150,300,50);

		lab2.setBounds(50,250,400,50);
		rb1.setBounds(500,250,300,50);
		rb2.setBounds(500,300,300,50);
		rb3.setBounds(500,350,300,50);

		lab3.setBounds(50,450,800,50);

		b1.setBounds(50,600,300,50);
		b2.setBounds(500,600,300,50);
	
		setLayout(null);
		setSize(1000,1000);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			cb1.setSelected(true);
			cb2.setSelected(true);
			cb3.setSelected(true);
		}
		else
		{
			cb1.setSelected(false);
			cb2.setSelected(false);
			cb3.setSelected(false);
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox cb=(JCheckBox)ie.getSource();
		String msg=cb.getText();
		if(cb.isSelected())
		  msg+=" selected";
		else
		  msg+=" deselected";
		lab3.setText(msg);
	}
}
class Swing5
{
	public static void main(String arg[])
	{
		new Box();
	}
}