package labs;
//*********************************************************
// VoteCounterPanel.java  
//
// Panel for the GUI that tallies votes for two candidates,
// Joe and Sam.
//*********************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel
{
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;

    //----------------------------------------------
    // Constructor: Sets up the GUI.
    //----------------------------------------------
    public VoteCounterPanel()
    {
	votesForJoe = 0;

	joe = new JButton("Vote for Joe");
	joe.addActionListener(new VoteButtonListener());

	labelJoe = new JLabel("Votes for Joe: " + votesForJoe);

	add(joe);
	add(labelJoe);

	setPreferredSize(new Dimension(300, 40));
	setBackground(Color.cyan);
    }

    //***************************************************
    // Represents a listener for button push (action) events
    //***************************************************
    private class VoteButtonListener implements ActionListener
    {
	//----------------------------------------------
	// Updates the appropriate vote counter when a 
	// button is pushed for one of the candidates.
	//----------------------------------------------
	public void actionPerformed(ActionEvent event)
	{
	    votesForJoe++;
	    labelJoe.setText("Votes for Joe: " + votesForJoe);
	}
    }
}
