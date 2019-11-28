import javax.swing.*;
import java.awt.*;
class AddPanel extends JPanel
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	AddPanel()
	{
		l1=new JLabel("ID");
		l2=new JLabel("Name");
		l3=new JLabel("Branch");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);	
		b1=new JButton("Add");
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(b1);
		setBackground(Color.green);
	}
}
class SearchPanel extends JPanel
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	SearchPanel()
	{
		l1=new JLabel("ID");
		l2=new JLabel("Name");
		l3=new JLabel("Branch");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);	
		b1=new JButton("Search");
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(b1);
		setBackground(Color.yellow);
	}
}
class DeletePanel extends JPanel
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	DeletePanel()
	{
		l1=new JLabel("ID");
		l2=new JLabel("Name");
		l3=new JLabel("Branch");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);	
		b1=new JButton("Delete");
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(b1);
		setBackground(Color.red);
	}
}
class Operations extends JFrame
{	AddPanel ap;
	DeletePanel dp;
	SearchPanel sp;
	JTabbedPane jtp;
	Operations()
	{
		ap=new AddPanel();
		dp=new DeletePanel();
		sp=new SearchPanel();
		jtp=new JTabbedPane();		
		jtp.add("Add",ap);	
		jtp.add("Delete",dp);
		jtp.add("Search",sp);
		add(jtp);
		setSize(600,400);
		setVisible(true);
	}
}
class G13TabbedPanels
{
	public static void main(String arg[])
	{
		new Operations();
	}
}