//********************************************************************
//  QuoteGUI.java       Author: Lewis/Loftus/Cocking
//
//  Represents the user interface for the QuoteOptions program.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuoteGUI
{
   private final int WIDTH = 300, HEIGHT = 100;
   private JPanel primary;
   private JLabel quote;
   private JRadioButton comedy, philosophy, carpentry;
   private String comedyQuote = "Take my wife, please.";
   private String philosophyQuote = "I think, therefore I am.";
   private String carpentryQuote = "Measure twice. Cut once.";

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and a set of radio buttons
   //  that control its text.
   //-----------------------------------------------------------------
   public QuoteGUI()
   {
      quote = new JLabel (comedyQuote);
      quote.setFont (new Font ("Helvetica", Font.BOLD, 24));

      comedy = new JRadioButton ("Comedy", true);
      comedy.setBackground (Color.green);
      philosophy = new JRadioButton ("Philosophy");
      philosophy.setBackground (Color.green);
      carpentry = new JRadioButton ("Carpentry");
      carpentry.setBackground (Color.green);

      ButtonGroup group = new ButtonGroup();
      group.add (comedy);
      group.add (philosophy);
      group.add (carpentry);

      QuoteListener listener = new QuoteListener();
      comedy.addActionListener (listener);
      philosophy.addActionListener (listener);
      carpentry.addActionListener (listener);
      primary = new JPanel();
      primary.add (quote);
      primary.add (comedy);
      primary.add (philosophy);
      primary.add (carpentry);
      primary.setBackground (Color.green);
      primary.setPreferredSize (new Dimension(WIDTH, HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Returns the primary panel containing the GUI.
   //-----------------------------------------------------------------
   public JPanel getPanel()
   {
      return primary;
   }

   //*****************************************************************
   //  Represents the listener for all radio buttons
   //*****************************************************************
   private class QuoteListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Sets the text of the label depending on which radio
      //  button was pressed.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         Object source = event.getSource();

         if (source == comedy)
            quote.setText (comedyQuote);
         else
            if (source == philosophy)
               quote.setText (philosophyQuote);
            else
               quote.setText (carpentryQuote);
      }
   }
}
