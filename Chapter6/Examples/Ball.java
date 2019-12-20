package GUI;

import java.awt.*;
import java.util.*;

public class Ball 
{
	protected Random rand = new Random();
	protected int x, y, diameter = 25, speed = 0;
	protected  int fw,fh;
	protected  float red, green, blue;
	protected  boolean up = false, right = false;
	
	public Ball(int frameWidth, int frameHeight)
	{
		fw = frameWidth;
		fh = frameHeight;
		diameter = rand.nextInt(50)+20;
		x = rand.nextInt(fw-diameter);
		y = rand.nextInt(fh-diameter);
		speed = (rand.nextInt(2)+1)*10;
		up = rand.nextBoolean();
		right = rand.nextBoolean();
		red = rand.nextFloat();
		blue = rand.nextFloat();
		green = rand.nextFloat();
	}
	public Ball(int frameWidth, int frameHeight, Color color)
	{
		fw = frameWidth;
		fh = frameHeight;
		diameter = rand.nextInt(50)+20;
		x = rand.nextInt(fw-diameter);
		y = rand.nextInt(fh-diameter);
		speed = rand.nextInt(2)+2;
		up = rand.nextBoolean();
		right = rand.nextBoolean();
		red = color.getRed();
		blue = color.getBlue();
		green = color.getGreen();
	}
	public void move()
	{
		if(right) 
			x += speed;
		else
			x -= speed;
		
		if(up)
			y -= speed;
		else
			y += speed;
		
		if(x<0) 
			right = true;
		if(x>(fw-diameter))
			right = false;
		
		if(y<0) 
			up = false;
		if(y>(fh-diameter))
			up = true;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public boolean getUP()
	{
		return up;
	}
	public boolean getRight()
	{
		return right;
	}
	
	public void setUP(boolean up)
	{
		this.up = up;
	}
	public void setRight(boolean right)
	{
		this.right = right;
	}
	public int getDiameter()
	{
		return diameter;
	}
	
	public void setDiameter(int diameter)
	{
		this.diameter = diameter;
	}
	public void collision(Ball other)
	{
		if(x < other.getX() && x+diameter > other.getX() && y < other.getY() && y+diameter > other.getY())
		{
			up = !up;
			right = !right;
			
		}
	}
	public void draw(Graphics2D g)
	{
		g.setColor(new Color(red,blue,green));
		g.fillOval(x,y,diameter,diameter);
	}
	
	public void reset() 
	{
		diameter = rand.nextInt(50)+20;
		x = rand.nextInt(fw-diameter);
		y = rand.nextInt(fh-diameter);
		speed = rand.nextInt(2)+2;
		up = rand.nextBoolean();
		right = rand.nextBoolean();
		red = rand.nextFloat();
		blue = rand.nextFloat();
		green = rand.nextFloat();
	}
}
