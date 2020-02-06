// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args) {
	    //Dog dog = new Dog("Spike");
        //System.out.println(dog.getName() + " says " + dog.speak());
        
        Labrador lab = new Labrador("Lab", "Red");
        Yorkshire york = new Yorkshire("John");

        System.out.println(lab.getName() + " says " + lab.speak());
        System.out.println(york.getName() + " says " + york.speak());

        System.out.println(york.avgBreedWeight());
        System.out.println(lab.avgBreedWeight());

    }
}