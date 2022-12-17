//*********************************************************
// Dog.java
// A class that holds a dog's name and can make it speak.
// ********************************************************
public class Dog
{
    private String name;
    private int age;

    // -----------------------------------------------
// Constructor -- store name
// -----------------------------------------------
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // -----------------------------------------------
// Returns the dog's name
// -----------------------------------------------
    public String getName() {
        return name;
    }

    // -----------------------------------------------
// Returns the dog's age
// -----------------------------------------------
    public String getAge() {
        return ""+ age;
    }

    // -----------------------------------------------
// Returns the dog's age
// -----------------------------------------------
    public void setAge(int age) {
        this.age = age;
    }

    // ----------------------------------------------
// Returns a string with the dog's bark
// ----------------------------------------------
    public String speak() {
        return "Woof";
    }
}