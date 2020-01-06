// *******************************************************
//    StickFigure.java
//
//    Represents a graphical stick figure
// *******************************************************

import java.awt.*;

public class StickFigure
{
    private int baseX;      // center of the figure
    private int baseY;      // bottom of the feet
    private Color color;    // color of the figure
    private int height;     // height of the figure
    private int headW;      // width of the head
    private int legLength;  // length of the legs
    private int legPosition;// # pixels the legs are up from vertical
    private int armLength;  // horizontal length of the arms
    private int armToFloor; // distance from base to arms
    private int armPosition;// # pixels arm is above/below horizontal    

    // --------------------------------------------------------------
    // Construct a stick figure given its four attributes
    // --------------------------------------------------------------
    public StickFigure (int center, int bottom, Color shade, int size)
    {
	baseX = center;
	baseY = bottom;
	color = shade;
	height = size;

	// define body positions proportional to height
	headW = height / 5;
	legLength = height / 2;
	armToFloor = 2 * height / 3;
	armLength =  height / 3;

	// set initial position of arms and legs
	armPosition = -20;
	legPosition = 15;
    }

    // ----------------------------------------------
    // Draw the figure
    // ----------------------------------------------
    public void draw (Graphics page)
    {
	// compute y-coordinate of top of head
	int top = baseY - height;

	page.setColor (color);

	// draw the head
	page.drawOval(baseX-headW/2, top, headW, headW);

	// draw the trunk
	page.drawLine (baseX, top+headW, baseX, baseY - legLength);

	// draw the legs
	page.drawLine(baseX, baseY-legLength, baseX-legPosition, baseY);
	page.drawLine(baseX, baseY-legLength, baseX+legPosition, baseY);

	// draw the arms
	int startY = baseY - armToFloor;
	page.drawLine(baseX, startY, baseX-armLength, startY-armPosition);
	page.drawLine(baseX, startY, baseX+armLength, startY-armPosition);
    }

    // -----------------------------------------------------
    // Move the figure -- first parameter gives the
    // number of pixels over (to right if over is positive,
    // to the left if over is negative) and up or down 
    // (down if the parameter down is positive, up if it is
    // negative)
    // -----------------------------------------------------
    public void move (int over, int down)
    {
	baseX += over;
	baseY += down;
    }

    // ----------------------------------------------------
    // Increase the height by the given factor (if the
    // factor is > 1 the figure will "grow" else it will
    // shrink)
    // ----------------------------------------------------
    public void grow (double factor)
    {
	height = (int) (factor * height);

	// reset body parts proportional to new height
	headW = height / 5;
	legLength = height / 2;
	armToFloor = 2 * height / 3;
	armLength = height / 3;
    }

    // -------------------------------------------------
    // set the legPosition (dist. from vertical) to
    // new value
    // -------------------------------------------------
    public void setLegPosition (int newPosition)
    {
	legPosition = newPosition;
    }

    // ----------------------------------------
    // set the arm position to the new value
    // ----------------------------------------
    public void setArmPosition (int newPos)
    {
	armPosition = newPos;
    }
}