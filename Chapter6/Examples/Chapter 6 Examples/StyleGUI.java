//********************************************************************
//  StyleGUI.java       Author: Lewis/Loftus/Cocking
//
//  Represents the user interface for the StyleOptions program.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleGUI
{
   private final int WIDTH = 300, HEIGHT = 100, FONT_SIZE = 36;
   private JLabel saying;
   private JCheckBox bold, italic;
   private JPanel primary;

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and some check boxes that
   //  control the style of the label's font.
   //-----------------------------------------------------------------
   public StyleGUI()
   {
      saying = new JLabel ("Say it with style!");
      saying.setFont (new Font ("Helvetica", Font.PLAIN, FONT_SIZE));

      bold = new JCheckBox ("Bold");
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);

      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);

      primary = new JPanel();
      primary.add (saying);
      primary.add (bold);
      primary.add (italic);
      primary.setBackground (Color.cyan);
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
   //  Represents the listener for both check boxes.
   //*****************************************************************
   private class StyleListener implements ItemListener
   {
      //--------------------------------------------------------------
      //  Updates the style of the label font style.
      //--------------------------------------------------------------
      public void itemStateChanged (ItemEvent event)
      {
         int style = Font.PLAIN;

         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;

         saying.setFont (new Font ("Helvetica", style, FONT_SIZE));
      }
   }
}
