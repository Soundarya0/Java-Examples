import java.awt.*;
import javax.swing.*;
class Unit extends JFrame
{
	JButton b[]; //reference to array of JButton references
	Unit(int w,int h, int l,int t,String name,int lo)
	{
		b=new JButton[50]; //array of JButton references (50) is created, but the actual JButton objects are not created
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton("button"+(i+1));
			if(lo==1)
			  if(i<5) add(b[i],BorderLayout.NORTH);
			  else if(i<15) add(b[i],BorderLayout.SOUTH);			  
			  else if(i<25) add(b[i],BorderLayout.EAST);
			  else if(i<35) add(b[i],BorderLayout.WEST);
			  else  add(b[i],BorderLayout.CENTER);
			else
			  add(b[i]);
			if(lo==4)
			{
				b[i].setBounds(10,13*i,200,13);
			}
		}
		if(lo==1) ;//setLayout(new BorderLayout());
		else if(lo==2) setLayout(new FlowLayout());
		else if(lo==3) setLayout(new GridLayout(5,10));
		else if(lo==4) setLayout(null);
		setSize(w,h);
		setLocation(l,t);
		setTitle(name);
		setVisible(true);	
	}
}
class GuiLayouts
{
	public static void main(String arg[]) 
	{
		Unit u1=new Unit(500,400,10,50,"Border Layout",1);		
		Unit u2=new Unit(500,400,510,50,"Flow Layout",2);		
		Unit u3=new Unit(1000,300,10,450,"Grid Layout",3);	
		Unit u4=new Unit(300,700,1010,50,"null Layout",4);
	}
}