// *******************************************************************
//  KochSnowflake.java               Author:  Lewis/Loftus
//
//  Demonstrates the use of recursion in graphics.
// *******************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KochSnowflake extends JApplet implements ActionListener
{
    private final int APPLET_WIDTH = 400;
    private final int APPLET_HEIGHT = 440;

    private final int MIN = 1, MAX = 9;

    private JButton increase, decrease;
    private JLabel titleLabel, orderLabel;
    private KochPanel drawing;
    private JPanel appletPanel, tools;

    // ---------------------------------------------------------
    //   Sets up the components for the applet.
    // ---------------------------------------------------------
    public void init()
    {
	tools = new JPanel ();
	tools.setLayout (new BoxLayout (tools, BoxLayout.X_AXIS));
	tools.setPreferredSize (new Dimension (APPLET_WIDTH, 40));
	tools.setBackground (Color.yellow);
	tools.setOpaque (true);

	titleLabel = new JLabel ("The Koch Snowflake");
	titleLabel.setForeground (Color.black);

	increase = new JButton ("Increase");
	increase.setMargin (new Insets (0, 0, 0, 0));
	increase.addActionListener (this);

	decrease = new JButton ("Decrease");
	decrease.setMargin (new Insets (0, 0, 0, 0));
	decrease.addActionListener (this);

	orderLabel = new JLabel ("Order: 1");
	orderLabel.setForeground (Color.black);

	tools.add (titleLabel);
	tools.add (Box.createHorizontalStrut (40));
	tools.add (decrease);
	tools.add (increase);
	tools.add (Box.createHorizontalStrut (20));
	tools.add (orderLabel);

	drawing = new KochPanel (1);

	appletPanel = new JPanel ();
	appletPanel.add (tools);
	appletPanel.add (drawing);

	getContentPane().add (appletPanel);

	setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }

    // ------------------------------------------------------------
    //  Determines which button was pushed, and sets the new order
    //  if it is in range.
    // ------------------------------------------------------------
    public void actionPerformed (ActionEvent event)
    {
	int order = drawing.getOrder ();

	if (event.getSource() == increase)
	    order++;
	else 
	    order--;

	if (order >= MIN && order <= MAX)
	    {
		orderLabel.setText ("Order: " + order);
		drawing.setOrder (order);
		repaint();
	    }
    }
}