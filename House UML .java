// Room.java (Parent Class)
// Parent class
class Room {

    // Method to show room information
    public void roomInfo() {
        System.out.println("This is a room.");
    }
}

//Bedroom.java
// Bedroom inherits Room
class Bedroom extends Room {

    // Bedroom specific method
    public void sleep() {
        System.out.println("Sleeping in the bedroom.");
    }
}

//Kitchen.java
// Kitchen inherits Room
class Kitchen extends Room {

    // Kitchen specific method
    public void cook() {
        System.out.println("Cooking in the kitchen.");
    }
}

//Bathroom.java
// Bathroom inherits Room
class Bathroom extends Room {

    // Bathroom specific method
    public void bath() {
        System.out.println("Taking a bath.");
    }
}

//Address.java
// Address class
class Address {

    String location;

    // Constructor
    public Address(String location) {
        this.location = location;
    }

    // Display address
    public void showAddress() {
        System.out.println("Address: " + location);
    }
}

//MailBox.java
// MailBox class
class MailBox {

    // Mail receiving method
    public void receiveMail() {
        System.out.println("Mail received.");
    }
}

//House.java
// House class
class House {

    // Association
    Address a1;

    // Aggregation
    MailBox m1;

    // Composition
    Bedroom b1 = new Bedroom();
    Kitchen k1 = new Kitchen();
    Bathroom bt1 = new Bathroom();

    // Constructor
    public House(Address a1, MailBox m1) {

        // Association
        this.a1 = a1;

        // Aggregation
        this.m1 = m1;
    }

    // Display all information
    public void showHouse() {

        System.out.println("------ House Details ------");

        a1.showAddress();

        m1.receiveMail();

        b1.roomInfo();
        b1.sleep();

        k1.roomInfo();
        k1.cook();

        bt1.roomInfo();
        bt1.bath();
    }
}
// Main.java

public class Main {

    public static void main(String[] args) {

        // Create Address object
        Address a1 = new Address("Dhaka, Bangladesh");

        // Create MailBox object
        MailBox m1 = new MailBox();

        // Create House object
        House h1 = new House(a1, m1);

        // Display house information
        h1.showHouse();
    }
}
/* Output
------ House Details ------
Address: Dhaka, Bangladesh
Mail received.
This is a room.
Sleeping in the bedroom.
This is a room.
Cooking in the kitchen.
This is a room.
Taking a bath. */
