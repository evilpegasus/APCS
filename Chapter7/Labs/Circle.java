// ****************************************************************
// FILE:  Circle.java
//
// Purpose: Define a Circle class with methods to create and draw
//          a circle of random size, color, and location.
// ****************************************************************

import java.awt.*;
import java.util.Random;

public class Circle
{
    private int x, y;       // coordinates of the corner
    private int radius;     // radius of the circle
    private Color color;    // color of the circle

    static Random generator = new Random();

    //---------------------------------------------------------
    // Creates a random circle with properties in ranges given:
    //   -- radius 25..74
    //   -- color RGB value 0..16777215 (24-bit)
    //   -- x-coord of upper left-hand corner 0..599
    //   -- y-coord of upper left-hand corner 0..399
    //---------------------------------------------------------
    public Circle()
    {
        radius = Math.abs(generator.nextInt())%50 + 25;
        color = new Color(Math.abs(generator.nextInt())% 16777216);
        x = Math.abs(generator.nextInt())%600;
        y = Math.abs(generator.nextInt())%400;
    }

    //----------------------------------------------------------
    // Creates a circle of a given size (diameter).  Other 
    // attributes are random (as described above)
    //---------------------------------------------------------
    public Circle(int size)
    {
        radius = Math.abs(size/2);
        color = new Color(Math.abs(generator.nextInt())% 16777216);
        x = Math.abs(generator.nextInt())%600;
        y = Math.abs(generator.nextInt())%400;
    }


    //---------------------------------------------------------
    // Draws circle on graphics object given
    //---------------------------------------------------------
    public void draw(Graphics page)
    {
        page.setColor(color);
        page.fillOval(x,y,radius*2,radius*2);
    }


    //--------------------------------------------------------
    // Shifts the circle's position -- "over" is the number of
    // pixels to move horizontally (positive is to the right;
    // negative to the left); "down" is the number of pixels
    // to move vertically (positive is down; negative is up)
    //--------------------------------------------------------
    public void move (int over, int down)
    {
        x = x + over;
        y = y + down;
    }

    // ---------------------------------------------
    // Return the x coordinate of the circle corner
    // ---------------------------------------------
    public int getX()
    {
        return x;
    }

    // ---------------------------------------------
    // Return the y coordinate of the circle corner
    // ---------------------------------------------
    public int getY()
    {
        return y;
    }
}