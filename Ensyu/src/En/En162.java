package En;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
//import java.awt.Component;


public class En162 extends Applet
{
   public void paint(Graphics g)
   {
//	  Graphics gg = getGraphics();
//	  gg.drawString("test",10,40);
	  g.setColor(Color.red);
//      g.drawLine(10, 10, 100, 100);
      g.fillRect(10,10,100,100);
//     g.fillOval(120, 130, 50, 20);
     
   }
}