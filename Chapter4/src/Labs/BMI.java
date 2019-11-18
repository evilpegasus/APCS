package Labs;
//********************************************************************
//  BMI.java   
//
//  Sets up a GUI to calculate body mass index.
//********************************************************************

import javax.swing.JFrame;
public class BMI
{
   //-----------------------------------------------------------------
   //  Creates and displays the BMI GUI.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

       JFrame frame = new JFrame("BMI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       BMIPanel panel = new BMIPanel();

       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);

   }
}