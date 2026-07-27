//Car.java
// Parent Class
public abstract class Car {

    // Protected variables (accessible by child class)
    protected String model;
    protected String company;

    // Constructor
    public Car(String model, String company) {
        this.model = model;
        this.company = company;
    }

    // Abstract methods : Child class must implement these methods
  
    public abstract void drive();
    public abstract void stop();
}

//Engine.java
public class Engine {

    // Variables 
    private double capacity;

    // Constructor
    public Engine(double capacity) {
        this.capacity = capacity;
    }

    // Getter
    public double getCapacity() {
        return capacity;
    }
}

// DashBoard.java
public class DashBoard {

    // Variables 
    private double size;

    // Constructor
    public DashBoard(double size) {
        this.size = size;
    }

    // Getter
    public double getSize() {
        return size;
    }
}

// Volvo.java 

public class Volvo extends Car {

    // Volvo's own variables
    private double price;
    private String productionYear;
    private String registrationNumber;

    // Aggregation Variable
    private Engine e1;
    private DashBoard d1;

    // Constructor
    public Volvo(String model,
                 String company,
                 double price,
                 String productionYear,
                 String registrationNumber,
                 Engine e1,
                 DashBoard d1) {

        // Call Parent constructor
        super(model, company);

        this.price = price;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.e1 = e1;
        this.d1 = d1;
    }

    // Implement abstract method
    @Override
    public void drive() {
        System.out.println("Volvo is driving.");
    }

    // Implement abstract method
    @Override
    public void stop() {
        System.out.println("Volvo has stopped.");
    }

    // Volvo's own method
    public void changeFuel() {
        System.out.println("Fuel changed successfully.");
    }

    // Volvo's own method
    public void checkBattery() {
        System.out.println("Battery is in good condition.");
    }

    // Display all information
    public void showDetails() {

        System.out.println("Model : " + model);
        System.out.println("Company : " + company);
        System.out.println("Price : " + price);
        System.out.println("Production Year : " + productionYear);
        System.out.println("Registration Number : " + registrationNumber);

        System.out.println("Engine Capacity : " + e1.getCapacity());
        System.out.println("Dashboard Size : " + d1.getSize());
    }
}
// Main Class
public class Main {

    public static void main(String[] args) {

        // Create Engine object
        Engine e1 = new Engine(1998.5);

        // Create DashBoard object
        DashBoard d1 = new DashBoard(12.5);

        // Create Volvo object
        Volvo v1 = new Volvo(
                "XC90",
                "Volvo",
                8500000,
                "2024",
                "DHAKA-12345",
                e1,
                d1 );

        // Display information
        volvo.showDetails();

        System.out.println();

        // Call methods
        volvo.drive();
        volvo.stop();
        volvo.changeFuel();
        volvo.checkBattery();
    }
}
