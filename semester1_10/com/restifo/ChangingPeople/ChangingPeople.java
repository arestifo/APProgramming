package com.restifo.ChangingPeople;
import static java.lang.System.out;
// **********************************************************************
// ChangingPeople.java
//
// Demonstrates parameter passing -- contains a method that should
// change to Person objects.
// **********************************************************************
public class ChangingPeople
{
    // ---------------------------------------------------------
    // Sets up two person objects, one integer, and one String
    // object. These are sent to a method that should make
    // some changes.
    // ---------------------------------------------------------
    public static void main (String[] args)
    {
        Person person1 = new Person("Sally", 13);
        Person person2 = new Person("Sam", 15);

        int age = 21;
        String name = "Jill";

        out.println("\nParameter Passing... Original values...");
        out.println("person1: " + person1);
        out.println("person2: " + person2);
        out.println("age: " + age + "\tname: " + name + "\n");

        changePeople(person1, person2, age, name);

        out.println("\nValues after calling changePeople...");
        out.println("person1: " + person1);
        out.println("person2: " + person2);
        out.println("age: " + age + "\tname: " + name + "\n");
    }
    
    // -------------------------------------------------------------------
    // Change the first actual parameter to "Jack - Age 101" and change
    // the second actual parameter to be a person with the age and
    // name given in the third and fourth parameters.
    // -------------------------------------------------------------------
    public static void changePeople(Person p1, Person p2, int age, String name)
    {
        out.println("\nInside changePeople... Original parameters...");
        out.println("person1: " + p1);
        out.println("person2: " + p2);
        out.println("age: " + age + "\tname: " + name + "\n");

        // Make changes
        Person p3 = new Person(name, age);
        p2 = p3;
        name = "Jack";
        age = 101;
        p1.changeName(name);
        p1.changeAge(age);

        // Print changes
        out.println("\nInside changePeople... Changed values...");
        out.println("person1: " + p1);
        out.println("person2: " + p2);
        out.println("age: " + age + "\tname: " + name + "\n");
    }
}