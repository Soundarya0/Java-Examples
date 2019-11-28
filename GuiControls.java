import java.awt.*;
import javax.swing.*;
class Unit extends JFrame
{
	JButton b;
	JCheckBox cb1,cb2,cb3;	
	JRadioButton rb1,rb2,rb3,rbMale,rbFemale;
	ButtonGroup bg1,bg2;	
	JComboBox combo;
	JTextField txt1,txt2,txt3;
	JTextArea ta1,ta2,ta3;
	JScrollPane jsp;
	String weeks[]={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	Unit(int w,int h, int l,int t,String name)
	{
		ta1=new JTextArea();
		ta2=new JTextArea();
		ta3=new JTextArea();
		add(ta1);
		add(ta2);
		ta1.setBounds(900,220,100,30);
		ta2.setBounds(900,260,200,100);
		jsp=new JScrollPane(ta3);
		jsp.setBounds(900,370,100,100);
		add(jsp);

		txt1=new JTextField();
		txt2=new JTextField(20);
		txt3=new JTextField("give info");
		add(txt1);
		add(txt2);
		add(txt3);
		txt1.setBounds(900,50,100,30);
		txt2.setBounds(900,85,200,15);
		txt3.setBounds(900,110,100,100);

		combo=new JComboBox(weeks);
		add(combo);
		combo.setBounds(750,50,100,30);

		rbMale=new JRadioButton("Male");
		rbFemale=new JRadioButton("Female");
		add(rbMale);
		add(rbFemale);
		bg2=new ButtonGroup();
		bg2.add(rbMale);
		bg2.add(rbFemale);
		rbMale.setBounds(600,50,100,30);
		rbFemale.setBounds(600,85,100,30);

		rb1=new JRadioButton("C#");
		rb2=new JRadioButton("Python");
		rb3=new JRadioButton("Perl");
		add(rb1);
		add(rb2);
		add(rb3);
		bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		rb1.setBounds(450,50,100,30);
		rb2.setBounds(450,85,100,30);
		rb3.setBounds(450,120,100,30);

		cb1=new JCheckBox("C");
		cb2=new JCheckBox("C++");
		cb3=new JCheckBox("Java");
		add(cb1);
		add(cb2);
		add(cb3);
		cb1.setBounds(300,50,100,30);
		cb2.setBounds(300,85,100,30);
		cb3.setBounds(300,120,100,30);

		b=new JButton("This is Button");
		add(b);
		b.setBounds(50,50,200,100);	
		
		setLayout(null);
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
	}
}
class GuiControls
{
	public static void main(String arg[]) 
	{
		Unit u1=new Unit(1200,650,10,50,"GUI Controls");		
	}
}