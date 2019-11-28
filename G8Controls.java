import javax.swing.*;
import java.awt.*;
class Win extends JFrame
{
	String opts[]={"Jan","February","Mar","Apr","May","June","July","August"};
	JButton but;
	JCheckBox che1,che2,che3;
	JRadioButton rad1,rad2,rad3;
	JComboBox combo;
	JList list;
	JTextField text;
	JTextArea area;
	ButtonGroup bg;
	JLabel lab1,lab2,lab3;
	Win()
	{
		text=new JTextField(20);
		add(text);
		area=new JTextArea(5,10);
		add(area);
		list=new JList(opts);
		add(list);
		combo=new JComboBox(opts);
		add(combo);
		lab2=new JLabel("You are a ");
		rad1=new JRadioButton("male");
		rad2=new JRadioButton("female");
		rad3=new JRadioButton("other");
		bg=new ButtonGroup();
		bg.add(rad1);
		bg.add(rad2);
		bg.add(rad3);
		add(lab2);
		add(rad1);
		add(rad2);
		add(rad3);
		lab1=new JLabel("What are you interested at...");
		add(lab1);
		che1=new JCheckBox("movies");
		che2=new JCheckBox("cricket");
		che3=new JCheckBox("music");
		add(che1);
		add(che2);
		add(che3);
		JButton but;
		but=new JButton(" OK ");
		add(but);
		lab3=new JLabel( new ImageIcon("small.jpg") );
		add(lab3);
		setLayout(new FlowLayout());
		setSize(1000,300);
		setVisible(true);
	}
}

class G8Controls
{
	public static void main(String arg[])
	{
		new Win();
	}
}