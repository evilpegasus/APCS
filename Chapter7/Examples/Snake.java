//********************************************************************
//  Snake.java       Author: Lewis/Loftus/Cocking
//
//  Represents a snake, which is a pet.
//********************************************************************

public class Snake extends Pet
{
   private int length;

   //-----------------------------------------------------------------
   // Creates a snake with the given name and length.
   //-----------------------------------------------------------------
   public Snake(String snakeName, int snakeLength)
   {
      super(snakeName);
      length = snakeLength;
   }

   //-----------------------------------------------------------------
   // Returns this snake's length.
   //-----------------------------------------------------------------
   public int getLength()
   {
      return length;
   }

   //-----------------------------------------------------------------
   // Returns a string representation of this snake.
   //-----------------------------------------------------------------
   public String toString()
   {
      return super.toString() + " is a snake, " + length + " inches long";
   }

   //-----------------------------------------------------------------
   // Returns a string indicating what this snake says.
   //-----------------------------------------------------------------
   public String speak()
   {
      return "hiss";
   }

   //-----------------------------------------------------------------
   // Returns a string indicating how this snake moves.
   //-----------------------------------------------------------------
   public String move()
   {
      return "slither";
   }
}
