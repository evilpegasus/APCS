public class Penguin implements Comparable
{
   private String name;
   private int swimSpeed;
   private double penguinSize;
   public static final int MAX_SPEED = 22;
   private static double largestPenguinSize = 0.0;
   
   public Penguin()
   {
      name = "bob";
      swimSpeed = 5;
      penguinSize = 2.0;
      if( penguinSize > largestPenguinSize)
      {
          largestPenguinSize = penguinSize;
      }
   }
  
   public Penguin(String n, int speed, double size)
   {
       name = n;
       swimSpeed = speed;
       penguinSize = size;
        if( penguinSize > largestPenguinSize)
        {
          largestPenguinSize = penguinSize;
        }
        if(swimSpeed > MAX_SPEED)
        {
           swimSpeed = MAX_SPEED;
        }
   }

   public static double getLargestPenguinSize()
   {
       return largestPenguinSize;
   }

   public double getSize()
   {
       return penguinSize;
   }
   
   public int getSwimSpeed()
   { 
      return swimSpeed;
   }

   public String toString()
   {
      return "Name: " + name + "Swim Speed: " + swimSpeed + "Penguin Size: " + penguinSize;
   }

   public int compareTo(Penguin other)
   {
      if (this.getSize() > other.getSize())
      {
          return 1;
      }
      else if (this.getSize() < other.getSize())
      {
          return -1;
      }
      else if(this.getSwimSpeed() > other.getSwimSpeed())
      {
         return 1;
      }
      else if(this.getSwimSpeed() < other.getSwimSpeed())
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }
}