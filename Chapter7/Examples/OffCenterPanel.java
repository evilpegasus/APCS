//********************************************************************
//  OffCenterPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents the primary drawing panel for the OffCenter applet.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class OffCenterPanel extends JPanel
{
   private DecimalFormat fmt;
   private Point current;
   private int centerX, centerY;
   private double length;

   //-----------------------------------------------------------------
   //  Sets up the panel and necessary data.
   //-----------------------------------------------------------------
   public OffCenterPanel (int width, int height)
   {
      addMouseListener (new OffCenterListener());

      centerX = width / 2;
      centerY = height / 2;

      fmt = new DecimalFormat ("0.##");

      setBackground (Color.yellow);
   }

   //-----------------------------------------------------------------
   //  Draws a line from the mouse pointer to the center point of
   //  the applet and displays the distance.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      page.setColor (Color.black);
      page.drawOval (centerX-3, centerY-3, 6, 6);

      if (current != null)
      {
         page.drawLine (current.x, current.y, centerX, centerY);
         page.drawString ("Distance: " + fmt.format(length), 10, 15);
      }
   }

   //*****************************************************************
   //  Represents the listener for mouse events.
   //*****************************************************************
   private class OffCenterListener extends MouseAdapter
   {
      //--------------------------------------------------------------
      //  Computes the distance from the mouse pointer to the center
      //  point of the applet.
      //--------------------------------------------------------------
      public void mouseClicked (MouseEvent event)
      {
         current = event.getPoint();
         length = Math.sqrt(Math.pow((current.x-centerX), 2) + 
                            Math.pow((current.y-centerY), 2));
         repaint();
      }
   }
}
