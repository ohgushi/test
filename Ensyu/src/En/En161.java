package En;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class En161 extends Applet
{
   public void paint(Graphics g)
      {
		  g.setFont(new Font("serif",Font.BOLD,80));	
		  g.setColor(Color.blue);
		  g.drawString("Hell", 20, 100);
   }
}
