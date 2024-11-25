package com.mycompany.encapsulationdanmethod;

/**
 * Class Person to demonstrate encapsulation and methods
 */
class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use setter to validate age during initialization
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        // Ensure age is positive
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be a positive number.");
        }
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/**
 * Main class to test Person functionality
 */
public class EncapsulationDanMethod {

    public static void main(String[] args) {
        // Creating an object of Person class
        Person person = new Person("John", 25);

        // Display initial information
        person.displayInfo();

        // Modify the name and age
        person.setName("Alice");
        person.setAge(30);
        person.displayInfo();

        // Attempt to set an invalid age
        person.setAge(-5);
        person.displayInfo();
    }
}
