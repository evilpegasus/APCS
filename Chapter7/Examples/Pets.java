//********************************************************************
//  Pets.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of abstract classes.
//********************************************************************

public class Pets
{
   //-----------------------------------------------------------------
   //  Instantiates a dog and a snake object and prints information
   //  about them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Dog fido = new Dog("Fido", 45);
      Snake sam = new Snake("Sam", 30);

      System.out.println(fido);
      System.out.println(fido.getName() + " says " + fido.speak());
      System.out.println(fido.move() + " " + fido.getName() + " "
                         + fido.move());

      System.out.println();
      System.out.println(sam);
      System.out.println(sam.getName() + " says " + sam.speak());
      System.out.println(sam.move() + " " + sam.getName() + " "
                         + sam.move());
   }
}
