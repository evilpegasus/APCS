package GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class BouncingBallGUI extends JFrame implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	protected static int frameWidth = 1000, frameHeight = 1000, mouseX, mouseY, speed;
	private String str ="";
	private boolean isPaused, isStarted, firstTime;
	private Thread thread;
	BufferedImage bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
	Graphics2D big;
	Rectangle area;
	
	//Declare a Ball array
	Ball[] ball = new Ball[20];
	Player player;
	public BouncingBallGUI()
	{
		setBackground(Color.white);
		setBounds(100,100,frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		//Initialize a Ball array
		for(int index = 0; index < ball.length; index++)
			ball[index] = new Ball(frameWidth,frameHeight);
		
		player = new Player(frameWidth,frameHeight);
		
		thread = new Thread(this);
		thread.start();
		isPaused = false;
		isStarted = false;
		firstTime = true;
		speed = 100;
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

	    if (firstTime) {
	      Dimension dim = getSize();
	      int w = dim.width;
	      int h = dim.height;
	      area = new Rectangle(dim);
	      bi = (BufferedImage) createImage(w, h);
	      big = bi.createGraphics();
	      big.setStroke(new BasicStroke(8.0f));
	      firstTime = false;
	    }
		
	    big.setColor(Color.white);
	    big.clearRect(0, 0, area.width, area.height);
		
		//Draw each Ball
		for(int index = 0; index < ball.length; index++)
			ball[index].draw(big);
		player.draw(big);
		
		g2.drawImage(bi, 0, 0,this);
	}
	
	public void run() 
	{
		
		while(true)
		{
			update();
			
			try 
			{
				Thread.sleep(speed);
			}catch(InterruptedException e)
			{
				System.out.println("Error in executing thread: " + e);
			}
			
			if(!isPaused)
			{
				repaint();
			}
		}

	}
	public void update()
	{
		//Update Ball movement
		if(!isPaused)
		{
			for(int index = 0; index < ball.length; index++)
			{
				ball[index].move();
				/*for (int i = 0; i < ball.length; i++) 
				{
					if(i != index)
						ball[index].collision(ball[i]);
					
				}*/
				if(isStarted)
					if(player.collision(ball[index],ball))
						speed -= 2;
			}
		}
		
		player.move(mouseX,mouseY);
		
	}
	public static void main(String[] args)
	{
		new BouncingBallGUI();
	}

	  public void mousePressed(MouseEvent e)
	  {
		mouseX = e.getX();
		mouseY = e.getY();
	    str = "Mouse Pressed";
	    
	  }
	  public void mouseReleased(MouseEvent e)
	  {
		mouseX = e.getX();
		mouseY = e.getY();
	    str = "Mouse Released";
	    
	  }
	  public void mouseClicked(MouseEvent e)
	  {
		mouseX = e.getX();
		mouseY = e.getY();
	    str = "Mouse Clicked";
	    
	  }
	  public void mouseEntered(MouseEvent e)
	  {
		mouseX = e.getX();
		mouseY = e.getY();
	    str = "Mouse Entered";
	    
	  }
	  public void mouseExited(MouseEvent e)
	  {
		mouseX = e.getX();
		mouseY = e.getY();
	    str = "Mouse Exited";
	    
	  }
	                          // override MouseMotionListener two abstract methods
	  public void mouseMoved(MouseEvent e)
	  {
		  mouseX = e.getX();
		    mouseY = e.getY();
	    str = "Mouse Moved";
	    
	  }
	  public void mouseDragged(MouseEvent e)
	  {
	    mouseX = e.getX();
	    mouseY = e.getY();
	    str = "Mouse dragged";
	    
	  }

	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			isPaused = true;
        }
		if(e.getKeyCode() == KeyEvent.VK_S){
			isStarted = true;
        }
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			isPaused = false;
        }
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
