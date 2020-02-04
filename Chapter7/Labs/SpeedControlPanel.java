// ******************************************************************
//   SpeedControlPanel.java
//
//   The panel for the bouncing ball.  Similar to 
//   ReboundPanel.java in Listing 8.16 in the text, except a circle
//   rather than a happy face is rebounding off the edges of the
//   window.
// ******************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SpeedControlPanel extends JPanel
{
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int BALL_SIZE = 50;
    
    private Circle bouncingBall;   // the object that moves
    private Timer timer;
    private int moveX, moveY;      // increment to move each time

    // ---------------------------------------------
    //  Sets up the panel, including the timer 
    //  for the animation
    // ---------------------------------------------
    public SpeedControlPanel ()
    {
	timer = new Timer(30, new ReboundListener());
     
	this.setLayout (new BorderLayout());

	bouncingBall = new Circle(BALL_SIZE);

	moveX = moveY = 5;   

	// Set up a slider object here

	setPreferredSize (new Dimension (WIDTH, HEIGHT));
	setBackground(Color.black);
	timer.start();
    }

    // --------------------
    // Draw the ball
    // --------------------
    public void paintComponent (Graphics page)
    {
	  super.paintComponent (page);
        bouncingBall.draw(page);
    }

    // ***************************************************
    //   An action listener for the timer
    // ***************************************************
    public class ReboundListener implements ActionListener 
    {
	// ----------------------------------------------------
	// actionPerformed is called by the timer -- it updates
	// the position of the bouncing ball
	// ----------------------------------------------------
	public void actionPerformed(ActionEvent action)
	{
	    bouncingBall.move(moveX, moveY);
	    
	    // change direction if ball hits a side
	    int x = bouncingBall.getX();
	    int y = bouncingBall.getY();
	    if (x < 0 || x >= WIDTH - BALL_SIZE)
		moveX = moveX * -1;
	
	    if (y <= 0 || y >= HEIGHT - BALL_SIZE)
		moveY = moveY * -1;  
	    repaint();
	}
    }
    
    // *****************************************************
    //   A change listener for the slider.
    // *****************************************************
    private class SlideListener implements ChangeListener
    {
	// -------------------------------------------------
	//  Called when the state of the slider has changed;
	//  resets the delay on the timer.
	// -------------------------------------------------
	public void stateChanged (ChangeEvent event)
	{
	  
	  
	}
    }
}
