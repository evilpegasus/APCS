package examples;
//********************************************************************
//  Bullseye.java       Author: Lewis/Loftus/Cocking
//  
//  Demonstrates the use of conditionals and loops to guide drawing.
//********************************************************************

import java.applet.Applet;
import java.awt.*;

public class Bullseye extends Applet
{
   //-----------------------------------------------------------------
   //  Paints a bullseye target.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      final int MAX_WIDTH = 300, NUM_RINGS = 5, RING_WIDTH = 25;
      int x = 0, y = 0, diameter;

      setBackground (Color.cyan);

      diameter = MAX_WIDTH;
      page.setColor (Color.white);

      for (int count = 0; count < NUM_RINGS; count++)
      {
         if (page.getColor() == Color.black)  // alternate colors
            page.setColor (Color.white);
         else
            page.setColor (Color.black);

         page.fillOval (x, y, diameter, diameter);

         diameter -= (2 * RING_WIDTH);
         x += RING_WIDTH;
         y += RING_WIDTH;
      }

      // Draw the red bullseye in the center
      page.setColor (Color.red);
      page.fillOval (x, y, diameter, diameter);
   }
}
