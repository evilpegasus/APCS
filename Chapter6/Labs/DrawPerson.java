// *******************************************************************
//   DrawPerson.java
//
//   An program that uses the Graphics draw methods to draw a person.         
// *******************************************************************

import javax.swing.JFrame;

public class DrawPerson
{
   //-----------------------------------------------
   //  Creates the main frame for the draw program
   //-----------------------------------------------
   public static void main (String[] args)
   {
       JFrame frame = new JFrame ("Draw Person");
       frame.setDefaultCloseOperaton (JFrame.EXIT_ON_CLOSE);

       DrawPersonPanel panel = new DrawPersonPanel ();

       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);
    }
}