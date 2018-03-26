import java.applet.*;
import java.awt.*;
public class Draw3 extends Applet
{
  public void paint(Graphics g)
  {
    int x[] = { 10, 30, 40, 30, 10 };
    int y[] = { 10, 10, 30, 40, 20 };
    g.drawHexagon(x, y, 5);
 
    int x1[] = { 210, 280, 330, 210, 230 };
    int y1[] = { 70, 110, 160, 190, 100 };
    g.fillHexagon(x1, y1, 5);
  }
}
/*  
 <applet code="Draw3.class" height=200 width=320>
 </applet>
 */