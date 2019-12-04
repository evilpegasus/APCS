//********************************************************************
//  FahrenheitGUI.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of JFrame and JTextArea GUI components.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitGUI
{
   private int WIDTH = 300;
   private int HEIGHT = 75;

   private JFrame frame;
   private JPanel panel;
   private JLabel inputLabel, outputLabel, resultLabel;
   private JTextField fahrenheit;

   //-----------------------------------------------------------------
   //  Sets up the GUI.
   //-----------------------------------------------------------------
   public FahrenheitGUI()
   {
      frame = new JFrame ("Temperature Conversion");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      inputLabel = new JLabel ("Enter Fahrenheit temperature:");
      outputLabel = new JLabel ("Temperature in Celsius: ");
      resultLabel = new JLabel ("---");

      fahrenheit = new JTextField (5);
      fahrenheit.addActionListener (new TempListener());

      panel = new JPanel();
      panel.setPreferredSize (new Dimension(WIDTH, HEIGHT));
      panel.setBackground (Color.yellow);
      panel.add (inputLabel);
      panel.add (fahrenheit);
      panel.add (outputLabel);
      panel.add (resultLabel);

      frame.getContentPane().add (panel);
   }
   //-----------------------------------------------------------------
   //  Displays the primary application frame.
   //-----------------------------------------------------------------
   public void display()
   {
      frame.pack();
      frame.setVisible(true);
   }

   //*****************************************************************
   //  Represents an action listener for the temperature input field.
   //*****************************************************************
   private class TempListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Performs the conversion when the enter key is pressed in
      //  the text field.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         int fahrenheitTemp, celsiusTemp;

         String text = fahrenheit.getText();

         fahrenheitTemp = Integer.parseInt (text);
         celsiusTemp = (fahrenheitTemp-32) * 5/9;

         resultLabel.setText (Integer.toString (celsiusTemp));
      }
   }
}
