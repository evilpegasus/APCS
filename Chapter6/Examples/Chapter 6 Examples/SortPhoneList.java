//********************************************************************
//  SortPhoneList.java       Author: Lewis/Loftus/Cocking
//
//  Driver for testing an object sort.
//********************************************************************

public class SortPhoneList
{
   //-----------------------------------------------------------------
   //  Creates an array of Contact objects, sorts them, then prints
   //  them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Contact[] friends = new Contact[7];

      friends[0] = new Contact ("Barika", "Favaken", "610-555-7384");
      friends[1] = new Contact ("Lorenz", "Lowski", "215-555-3827");
      friends[2] = new Contact ("Ely", "Kassakian", "733-555-2969");
      friends[3] = new Contact ("Galen", "Powers", "663-555-3984");
      friends[4] = new Contact ("Laura", "Getz", "464-555-3489");
      friends[5] = new Contact ("Ching", "Lee", "322-555-2284");
      friends[6] = new Contact ("Susan", "Getz", "243-555-2837");

      Sorts.insertionSort(friends);

      for (Contact contact: friends)
         System.out.println (contact);
   }
}
