//********************************************************************
//  PushCounter.java       Authors: Lewis/Loftus/Cocking
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounter extends JApplet
{
   private int APPLET_WIDTH = 300, APPLET_HEIGHT = 35;
   private int pushes;
   private JLabel label;
   private JButton push;

   //-----------------------------------------------------------------
   //  Sets up the GUI.
   //-----------------------------------------------------------------
   public void init ()
   {
      pushes = 0;

      push = new JButton ("Push Me!");
      push.addActionListener (new ButtonListener());

      label = new JLabel ("Pushes: " + Integer.toString (pushes));

      Container cp = getContentPane();
      cp.setBackground (Color.cyan);
      cp.setLayout (new FlowLayout());
      cp.add (push);
      cp.add (label);

      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }


   //********************************************************************
   //  Represents a listener for button push (action) events.
   //********************************************************************
   private class ButtonListener implements ActionListener
   {
      //-----------------------------------------------------------------
      //  Updates the counter when the button is pushed.
      //-----------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         pushes++;
         label.setText("Pushes: " + Integer.toString (pushes));
         repaint ();
      }
   }
}
