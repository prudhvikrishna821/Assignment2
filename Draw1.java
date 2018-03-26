import java.applet.Applet;
import java.awt.Graphics;
public class Draw1 extends Applet
{
public void paint(Graphics g)
{
g.drawRect(20,20,100,60);
g.fillRect(30,150,60,40);
}
}
/*  
 <applet code="Draw1.class" height=200 width=320>
 </applet>
 */