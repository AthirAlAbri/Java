// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTester {

    public static void main(String[] args) {

        Labrador dog = new Labrador("Spike", "Black");
        System.out.println(dog.getName() + " says " + dog.speak());
    }
}