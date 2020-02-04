// **********************************************************
//   CountDownPanel.java
//
//   Panel for a digital display that counts down from 10.
//   The display can be stopped or reset with a mouse click.
// ********************************************************** 

import DigitalDisplay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CountDownPanel extends JPanel
{
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int DISPLAY_WIDTH = 150;
    private final int DISPLAY_HEIGHT = 100;
    private final int DELAY = 200;
    private final int COUNT_START = 10;

    private DigitalDisplay clock;
    private Timer timer;
    

    // ---------------------------------------------------------
    //   Set up the applet.
    // ---------------------------------------------------------
    public CountDownPanel (Timer countdown)
    {
	// Set up the timer



	setBackground (Color.blue);
	setPreferredSize (new Dimension (WIDTH, HEIGHT));

     
	clock = new DigitalDisplay(COUNT_START, WIDTH/2 - DISPLAY_WIDTH,
				   HEIGHT/2 - DISPLAY_HEIGHT,
				   DISPLAY_WIDTH, DISPLAY_HEIGHT);
    }


    // ----------------
    // draw the clock
    // ----------------
    public void paintComponent (Graphics page)
    {
	super.paintComponent (page);
	clock.draw(page);
    }

}