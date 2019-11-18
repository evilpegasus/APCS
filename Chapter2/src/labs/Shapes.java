package labs;
// ****************************************************************
//   Shapes.java
//
//   The program will draw two filled rectangles and a
//   filled oval.
// ****************************************************************

import javax.swing.JApplet;
import java.awt.*;

public class Shapes extends JApplet
{
    public void paint (Graphics page)
    {
	// Declare size constants
	final int MAX_SIZE = 300;
	final int PAGE_WIDTH = 600;
	final int PAGE_HEIGHT = 400;

	// Declare variables
	int x, y;    // x and y coordinates of upper left-corner of each shape
	int width, height; // width and height of each shape 

	// Set the background color
	setBackground (Color.yellow);

	// Set the color for the next shape to be drawn
	page.setColor (Color.blue);

	// Assign the corner point and width and height
	x = 200;
	y = 150;
	width = 100;
	height = 70;

	// Draw the rectangle
	page.fillRect(x, y, width, height);
    }
}