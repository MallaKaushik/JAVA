package programs;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseE" width=300 height=200>
</applet>
*/
public class MouseE extends Applet implements MouseListener,MouseMotionListener
{
String msg=" ";
int mouseX=0;
int mouseY=0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse Clicked";
repaint();
}
public void mouseExited(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse Exited";
repaint();
}
public void mouseEntered(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse Entered";
repaint();
}
public void mousePressed(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg=" Hello";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Hai";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="*";
showStatus("Dragged mouse at"+mouseX+","+mouseY);
repaint();
}
public void mouseMoved(MouseEvent me)
{
showStatus("Moving mouse at"+me.getX()+","+me.getY());
}
public void paint(Graphics g)
{
g.drawString(msg,mouseX,mouseY);
}
}