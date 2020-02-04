// ***************************************************
//   DigitalDisplay.java
//
//   A simple rectangular display of a single number
// ***************************************************

import java.awt.*;

public class DigitalDisplay
{
    private int displayVal;        // value to be displayed
    private int x, y;              // position
    private int width, height;     // size
    private Font displayFont;      // font for the number

    // ---------------------------------------------------------
    // construct a DigitalDisplay object with the given values
    // and New Century Schoolbook font in 40 point bold
    // ---------------------------------------------------------
    public DigitalDisplay(int start, int x, int y, int w, int h)
    {
	this.x = x;
	this.y = y;
	width = w;
	height = h;
	displayVal = start;

	displayFont = new Font ("New Century Schoolbook", Font.BOLD, 40); 
    }

    // ----------------------------
    // decrement the display value
    // ----------------------------
    public void decrement()
    {
	displayVal--;
    }

    // ----------------------------
    // increment the display value
    // ----------------------------
    public void increment()
    {
	displayVal++;
    }

    // ----------------------------
    // return the display value
    // ----------------------------
    public int getVal()
    {
	return displayVal;
    }

    // ------------------------------------------------------
    // reset the display value to that given in the parameter
    // ------------------------------------------------------
    public void reset (int val)
    {
	displayVal = val;
    }

    // ----------------
    // draw the display
    // ----------------
    public void draw (Graphics page)
    {
	// draw a black border
	page.setColor (Color.black);
	page.fillRect (x, y, width, height);

	// a white inside
	page.setColor (Color.white);
	page.fillRect (x + 5, y + 5, width - 10, height - 10);

	// display the number centered
	page.setColor (Color.black);
	page.setFont (displayFont);
	int fontHeight = page.getFontMetrics().getHeight();
	int strWidth = page.getFontMetrics().stringWidth(""+displayVal);
	page.drawString (""+displayVal, x + width/2 - strWidth/2, 
			 y + fontHeight/2 + height/2);
    }
}