//********************************************************************
//  Book.java       Author: Lewis/Loftus/Cocking
//
//  Represents a book. Used as the parent of a derived class to
//  demonstrate inheritance.
//********************************************************************

public class Book
{
   public int pages = 1500;

   //----------------------------------------------------------------
   //  Prints a message about the pages of this book.
   //----------------------------------------------------------------
   public void pageMessage ()
   {
      System.out.println ("Number of pages: " + pages);
   }
}
