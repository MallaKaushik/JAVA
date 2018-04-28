import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="ButtonDemo" width=200 height=300>
</applet> */
public class ButtonDemo extends Applet implements ActionListener
{
String msg=" ";
Button yes,no,maybe;
public void init()
{
yes=new Button("YES");
no=new Button("NO");
maybe=new Button ("UNDECIDED");
add(yes);
add(no);
add(maybe);
yes.addActionListener(this);
no.addActionListener(this);
maybe.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("YES"))
{
msg="you pressed yes";
}
else if(str.equals("NO"))
{
msg="you pressed no";
}
else
{
msg="you pressed Undecided";
}
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,6,100);
}
}