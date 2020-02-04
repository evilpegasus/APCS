//********************************************************************
//  Dots.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates mouse events and drawing on a panel.
//********************************************************************

import javax.swing.*;

public class Dots
{
   //-----------------------------------------------------------------
   //  Creates and displays the application frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame dotsFrame = new JFrame ("Dots");
      dotsFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      dotsFrame.getContentPane().add (new DotsPanel());

      dotsFrame.pack();
      dotsFrame.setVisible(true);
   }
}
