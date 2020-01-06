// *******************************************************************
// FILE:  MovePanel.java
//
// The display panel for a key events program  -- arrow keys are used
// to move a stick figure around, the g key is used to make the figure
// grow by 50% (increase in height by 50%), the s key causes the
// figure to shrink (to half its size)
// *******************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovePanel extends JPanel
{
    private final int WIDTH = 600;
    private final int HEIGHT = 400;

    private final int JUMP = 5;    // number of pixels moved each step

    // the following give the initial parameters for the figure
    private final int START_CENTER = WIDTH/2;
    private final int START_BOTTOM = HEIGHT - 40;
    private final int SIZE = HEIGHT / 2;

    private StickFigure stickMan;

    // ---------------------------------------
    //   Constructor:  Sets up the panel
    // ---------------------------------------
    public MovePanel ()
    {
	addKeyListener(new MoveListener());

	stickMan = new StickFigure (START_CENTER, START_BOTTOM, 
				 Color.yellow, SIZE);

	setBackground (Color.black);
	setPreferredSize (new Dimension (WIDTH, HEIGHT));
	setFocusable(true);
    }

    // ---------------------------------------
    //    Draws the figure
    // ---------------------------------------
    public void paintComponent (Graphics page)
    {
	super.paintComponent (page);
	stickMan.draw (page);
    }


    // **********************************************************
    //  Represents a listener for keyboard activity.
    // **********************************************************
    private class MoveListener implements KeyListener
    {
	// --------------------------------------------------
	// Handle a key-pressed event: arrow keys cause the
	// figure to move horizontally or vertically; the g
	// key causes the figure to "grow", the s key causes
	// the figure to shrink, the u key causes arms and
	// legs to go up, m puts them in the middle, and d
	// down.
	// --------------------------------------------------
	public void keyPressed (KeyEvent event)
	{
	    switch (event.getKeyCode())
		{
		case KeyEvent.VK_LEFT:
		    stickMan.move(-1*JUMP, 0);
		    break;
		case KeyEvent.VK_RIGHT:
		    stickMan.move(JUMP, 0);
		    break;
		case KeyEvent.VK_G:
		    stickMan.grow (1.5);
		    break;
		default:
		}

	    repaint(); 
	}
	
	// --------------------------------------------
	// Define empty bodies for key event methods
	// not used
	// --------------------------------------------
	public void keyTyped (KeyEvent event) {}
	public void keyReleased (KeyEvent event) {}
    }
}