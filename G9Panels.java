import javax.swing.*;
import java.awt.*;
class DataPanel extends JPanel
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	DataPanel()
	{
		l1=new JLabel("ID");
		l2=new JLabel("Name");
		l3=new JLabel("Branch");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);	
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		setSize(200,400);
	}
}
class Add extends JFrame
{
	DataPanel dp;
	JButton but;
	Add()
	{
		dp=new DataPanel();
		dp.setBackground(Color.green);
		but=new JButton("ADD");
		add(dp);
		add(but);
		setLayout(new FlowLayout());
		setSize(1000,300);
		setVisible(true);
	}
}
class Search extends JFrame
{
	DataPanel dp;
	JButton but;
	Search()
	{
		dp=new DataPanel();
		dp.setBackground(Color.blue);
		but=new JButton("SEARCH");
		add(dp);
		add(but);
		setLayout(new FlowLayout());
		setSize(1000,300);
		setVisible(true);
		setLocation(50,350);
	}
}
class Delete extends JFrame
{
	DataPanel dp;
	JButton but;
	Delete()
	{
		dp=new DataPanel();
		dp.setBackground(Color.red);
		but=new JButton("DELETE");
		add(dp);
		add(but);
		setLayout(new FlowLayout());
		setSize(1000,300);
		setVisible(true);
		setLocation(450,350);
		
	}
}

class G9Panels
{
	public static void main(String arg[])
	{
		new Add();
		new Search();
		new Delete();
	}
}