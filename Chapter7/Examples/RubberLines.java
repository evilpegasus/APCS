//********************************************************************
//  RubberLines.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates mouse events and rubberbanding.
//********************************************************************

import javax.swing.*;

public class RubberLines extends JApplet
{
   private final int WIDTH = 300, HEIGHT = 200;

   //-----------------------------------------------------------------
   //  Sets up the applet to contain the drawing panel.
   //-----------------------------------------------------------------
   public void init()
   {
      getContentPane().add (new RubberLinesPanel());

      setSize (WIDTH, HEIGHT);
   }
}
