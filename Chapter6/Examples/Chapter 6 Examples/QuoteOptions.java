//********************************************************************
//  QuoteOptions.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of radio buttons.
//********************************************************************

import javax.swing.*;

public class QuoteOptions
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame quoteFrame = new JFrame ("Quote Options");
      quoteFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      QuoteGUI gui = new QuoteGUI();
      quoteFrame.getContentPane().add (gui.getPanel());

      quoteFrame.pack();
      quoteFrame.setVisible(true);
   }
}
