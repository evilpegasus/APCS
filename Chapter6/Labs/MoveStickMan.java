// *****************************************************************
//   MoveStickMan.java
//
//   Uses key events to move a stick figure around.
// *****************************************************************
import javax.swing.*;

public class MoveStickMan
{
    // ---------------------------------------------
    //  Creates and displays the application frame.
    // ---------------------------------------------
    public static void main (String[] args)
    {
	JFrame frame = new JFrame ("Moving a Stick Figure");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add (new MovePanel());

	frame.pack();
	frame.setVisible(true);
    }
}