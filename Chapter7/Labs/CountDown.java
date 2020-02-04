// **********************************************************
//   CountDown.java
//
//   Draws a digital display that counts down from 10.  The
//   display can be stopped or reset with a mouse click.
// ********************************************************** 


import DigitalDisplay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CountDown extends JApplet
{
    private final int DELAY = 200;
    private Timer timer;
    

    // ---------------------------------------------------------
    //   Initialize the applet, including the animation.
    // ---------------------------------------------------------
    public void init()
    {
	timer = new Timer (DELAY, null);

	getContentPane().add (new CountDownPanel(timer));
    }


    // ---------------------------------------------------------
    //   Start the animation when the applet is started.
    // ---------------------------------------------------------
    public void start()
    {
	timer.start();
    }

    // ---------------------------------------------------------
    //   Stop the animation when the applet is stopped.
    // ---------------------------------------------------------
    public void stop()
    {
	timer.stop();
    }


}