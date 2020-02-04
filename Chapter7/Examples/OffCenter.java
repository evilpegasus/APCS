//********************************************************************
//  OffCenter.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an event adapter class.
//********************************************************************

import javax.swing.*;

public class OffCenter extends JApplet
{
   private final int WIDTH = 300, HEIGHT = 300;

   //-----------------------------------------------------------------
   //  Sets up the applet.
   //-----------------------------------------------------------------
   public void init()
   {
      getContentPane().add(new OffCenterPanel (WIDTH, HEIGHT));

      setSize (WIDTH, HEIGHT);
   }
}
