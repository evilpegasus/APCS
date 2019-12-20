package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Player extends Ball
{
	int count;
	String str ="";
	public Player(int frameWidth, int frameHeight)
	{
		super(frameWidth, frameHeight, new Color(0,0,0));
		count=0;
	}
	
	public void move(double x, double y)
	{
         setX((int) x - getDiameter()/2);
         setY((int) y - getDiameter()/2);
	}
	
	public boolean collision(Ball other, Ball[] ball)
	{
		if(getX() < other.getX() && getX()+getDiameter() > other.getX() && getY() < other.getY() && getY()+getDiameter() > other.getY())
		{
			if(other.getDiameter() <= getDiameter())
			{
				count++;
				str = "" + count;
				setDiameter(getDiameter()+2);
				other.reset();
				for(Ball current: ball)
					current.setDiameter(rand.nextInt(getDiameter())+20);
				return true;
			}
			else
			{
				setDiameter(0);
				str = "You lost";
			}
		}
		return false;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void draw(Graphics2D g)
	{
		super.draw(g);
		g.drawString(str, getX(), getY());
	}
	
}
