// Abstract Class
abstract class Vehicle { // abstract মানে এই Class অসম্পূর্ণ (Incomplete Class)। এর Object তৈরি করা যায় না।
                             /* ❌ ভুল
                                Vehicle v = new Vehicle();
                                কারণ এটি Abstract Class। */
  
    // Abstract Method (Body নেই)
    abstract void start(); // এখন Child Class-কে নিজের মতো করে এই Method লিখতে হবে।

    // Normal Method (Body আছে)
    public void stop() {
        System.out.println("Vehicle Stopped");
    }
}

// Child Class
class Car extends Vehicle {

    // Abstract Method Override করতে হবে
    @Override
    public void start() {
        System.out.println("Car Starts with Key");
    }

}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Vehicle v = new Vehicle(); // Error (Abstract Class-এর Object তৈরি করা যায় না)

        Car c1 = new Car();

        c1.start();
        c1.stop();

    }

}
/*Output
Car Starts with Key
Vehicle Stopped*/
