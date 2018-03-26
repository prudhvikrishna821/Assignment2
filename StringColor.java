import java.awt.*;
import java.applet.*;
public class StringColor extends Applet
{
String str1,str2,str3;
public void init()
{
setSize(400,150);
setBackground(Color.white);
str1=("This is red text");
str2=("This is blue color");
str3=("This is black color");
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawString(str1,20,20);
g.setColor(Color.blue);
g.drawString(str2,10,60);
g.setColor(Color.black);
g.drawString(str3,10,100);
}
}
/*  
 <applet code="StringColor.class" height=200 width=320>
 </applet>
 */

 