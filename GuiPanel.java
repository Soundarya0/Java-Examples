import java.awt.*;
import javax.swing.*;
class NamePhone extends JPanel
{
	JTextField tfName,tfPh;
	JLabel lName,lPh;
	NamePhone()
	{
		lName=new JLabel("Name");
		lPh=new JLabel("Phone number");
		tfName=new JTextField(25);
		tfPh=new JTextField(15);
		add(lName);
		add(tfName);
		add(lPh);
		add(tfPh);
	}
}	
class Student extends JFrame
{
	JTextField tfColl,tfMarks;
	JLabel lColl,lMarks;
	NamePhone np;
	Student(int w,int h, int l,int t,String name)
	{
		lColl=new JLabel("College");
		lMarks=new JLabel("Marks");
		tfColl=new JTextField(20);
		tfMarks=new JTextField(10);
		np=new NamePhone();
		add(lColl);
		add(tfColl);
		add(np);
		add(lMarks);
		add(tfMarks);
		setLayout(new FlowLayout());
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
	}
}

class Emp extends JFrame
{
	JTextField tfSal;
	JLabel lSal;
	NamePhone np;
	Emp(int w,int h, int l,int t,String name)
	{
		lSal=new JLabel("Salary");
		tfSal=new JTextField(10);
		np=new NamePhone();
		add(np);
		add(lSal);
		add(tfSal);
		setLayout(new FlowLayout());
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
	}
}
class GuiPanel
{
	public static void main(String arg[]) 
	{
		Student s=new Student(1200,200,10,50,"Student form");		
		Emp e=new Emp(1000,250,10,350,"Employee form");
	}
}