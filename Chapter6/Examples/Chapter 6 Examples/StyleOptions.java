//********************************************************************
//  StyleOptions.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;

public class StyleOptions
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame styleFrame = new JFrame ("Style Options");
      styleFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      StyleGUI gui = new StyleGUI();
      styleFrame.getContentPane().add (gui.getPanel());

      styleFrame.pack();
      styleFrame.setVisible(true);
   }
}
