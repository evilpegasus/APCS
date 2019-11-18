package Labs;
//********************************************************************
//  BMIPanel.java     
//
//  Computes body mass index in a GUI.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BMIPanel extends JPanel
{
   private int WIDTH = 300;
   private int HEIGHT = 120;

   private JLabel heightLabel, weightLabel, BMILabel, resultLabel;
   private JTextField height, weight;
   private JButton calculate;

   //-----------------------------------------------------------------
   //  Sets up the GUI.
   //-----------------------------------------------------------------
   public BMIPanel()
   {

      //create labels for the height and weight textfields 
      heightLabel = new JLabel ("Your height in inches: ");
      weightLabel = new JLabel ("Your weight in pounds: ");

      //create a "this is your BMI" label
      //create a result label to hold the BMI value

      //create a JTextField to hold the person's height in inches
      //create a JTextField to hold the person's weight in pounds

      //create a button to press to calculate BMI
      //create a BMIListener and make it listen for the button to be pressed


      //add the height label and height textfield to the panel
      //add the weight label and weight textfield to the panel
      //add the button to the panel
      //add the BMI label to the panel
      //add the label that holds the result to the panel

      //set the size of the panel to the WIDTH and HEIGHT constants
      //set the color of the panel to whatever you choose
   }

   //*****************************************************************
   //  Represents an action listener for the calculate button.
   //*****************************************************************
   private class BMIListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Compute the BMI when the button is pressed
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         String heightText, weightText;
         int heightVal, weightVal;
	 double bmi;

	 //get the text from the height and weight textfields

	 //Use Integer.parseInt to convert the text to integer values

	 //Calculate the bmi = 703 * weight in pounds / (height in inches)^2

	 //Put result in result label.  Use Double.toString to convert double to string.

      }
   }
}