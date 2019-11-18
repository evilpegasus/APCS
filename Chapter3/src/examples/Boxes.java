package examples;
//********************************************************************
//  Boxes.java       Author: Lewis/Loftus/Cocking
//  
//  Demonstrates the use of conditionals and loops to guide drawing.
//********************************************************************

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class Boxes extends Applet
{
   //-----------------------------------------------------------------
   //  Paints boxes of random width and height in a random location.
   //  Narrow or short boxes are highlighted with a fill color.
   //-----------------------------------------------------------------
   public void paint(Graphics page)
   {
      final int NUM_BOXES = 50, THICKNESS = 5, MAX_SIDE = 50;
      final int MAX_X = 350, MAX_Y = 250;
      int x, y, width, height;

      setBackground (Color.black);
      Random generator = new Random();

      for (int count = 0; count < NUM_BOXES; count++)
      {
         x = generator.nextInt (MAX_X) + 1;
         y = generator.nextInt (MAX_Y) + 1;

         width = generator.nextInt (MAX_SIDE) + 1;
         height = generator.nextInt (MAX_SIDE) + 1;

         if (width <= THICKNESS)  // check for narrow box
         {
            page.setColor (Color.yellow);
            page.fillRect (x, y, width, height);
         }
         else
            if (height <= THICKNESS)  // check for short box
            {
               page.setColor (Color.green);
               page.fillRect (x, y, width, height);
            }
            else
            {
               page.setColor (Color.white);
               page.drawRect (x, y, width, height);
            }
      }
   }
}
