package programs;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Skey" width=300 height=200>
</applet>
*/
public class Sk extends Applet implements KeyListener
{
String msg=" ";
int x=10;
int y=20;
public void init()
{
addKeyListener(this);
}
public void keyPressed(KeyEvent ke)
{
showStatus("KeyDown");
}
public void keyReleased(KeyEvent ke)
{
showStatus("Key up");
}
public void keyTyped(KeyEvent 
		ke)
{
msg+=ke.getKeyChar();
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,x,y);
}
}