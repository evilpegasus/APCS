// *******************************************************************
//   DrawPersonPanel.java
//
//   An program that uses the Graphics draw methods to draw a person.         
// *******************************************************************

import javax.swing.JPanel;
import java.awt.*;


public class DrawPersonPanel extends JPanel
{
    private final int WIDTH = 600;
    private final int HEIGHT = 400;

    private int[] shirtX = {60,0,20,60,50,130,120,160,180,120};
    private int[] shirtY = {100,150,180,160,250,250,160,180,150,100};

    //--------------------------------------
    //  Constructor: Set up the panel.
    //--------------------------------------
    public DrawPersonPanel()
    {
	setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    //--------------------------------------
    //   Draw person
    //--------------------------------------
    public void paintComponent (Graphics page)
    {
	page.setColor(Color.blue);
	page.fillPolygon(shirtX, shirtY, shirtX.length);

    }
}