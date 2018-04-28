import java.awt.*;
import java.applet.*;
public class Testapp extends Applet{
	TextField name,reg,text1,text2,text3,text4;
	public void init()
	{
		name=new TextField(8);
		reg=new TextField(8);
		text1=new TextField(8);
		text2=new TextField(8);
		text3=new TextField(8);
		text4=new TextField(8);
		add(name);
		add(reg);
		add(text1);
		add(text2);
		add(text3);
		add(text4);
		name.setText("0");
		reg.setText("0");
		text1.setText("0");
		text2.setText("0");
		text3.setText("0");
		text4.setText("0");
	}
	public void paint(Graphics g)
	{
		int x=0,y=0,z=0,a=0,r,u=0,av=0;
		String s,s1 = null,s2 = null,s3 = null,s4 = null,s5 = null,s6 = null,s7;
		try
		{
			s1=name.getText();
			s2=reg.getText();
			r=Integer.parseInt(s2);
			s3=text1.getText();
			x=Integer.parseInt(s3);
			s4=text2.getText();
			y=Integer.parseInt(s4);
			s5=text3.getText();
			z=Integer.parseInt(s5);
			s6=text4.getText();
			a=Integer.parseInt(s6);
		}
		catch(Exception e)
		{}
		g.drawString("Input", 10, 50);
		g.drawString(s1,100,50);
		g.drawString(s2,100,70);
		g.drawString(s3,100,90);
		g.drawString(s4,100,110);
		g.drawString(s5,100,130);
		g.drawString(s6,100,150);
		u=x+y+z+a;
		s=String.valueOf(u);
		av=u/4;
		s7=String.valueOf(av);
		g.drawString("sum", 10, 170);
		g.drawString(s,100,170);
		g.drawString("avg",10,190);
		g.drawString(s7,100,190);
	}
		public boolean action(Event event,Object obj)
		{
			repaint();
			return true;
		}
	}
