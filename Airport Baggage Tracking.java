import java.util.ArrayList;
import java.util.Scanner;

class Baggage {

    private int bagId;
    private String passengerName;
    private String flightNumber;
    private double weight;
    private String status;

    public Baggage(int bagId, String passengerName, String flightNumber, double weight, String status) {
        this.bagId = bagId;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.weight = weight;
        this.status = status;
    }

    public int getBagId() {
        return bagId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Bag ID      : " + bagId);
        System.out.println("Passenger   : " + passengerName);
        System.out.println("Flight No   : " + flightNumber);
        System.out.println("Weight      : " + weight + " kg");
        System.out.println("Status      : " + status);
    }
}

public class AirportBaggageTracking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Baggage> bags = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Airport Baggage Tracking =====");
            System.out.println("1. Add Baggage");
            System.out.println("2. View All Baggage");
            System.out.println("3. Update Baggage Status");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Bag ID: ");
                    int bagId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Passenger Name: ");
                    String passenger = sc.nextLine();

                    System.out.print("Flight Number: ");
                    String flight = sc.nextLine();

                    System.out.print("Weight (kg): ");
                    double weight = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Status (Checked-In/In Transit/Loaded/Delivered): ");
                    String status = sc.nextLine();

                    bags.add(new Baggage(bagId, passenger, flight, weight, status));

                    System.out.println("Baggage added successfully.");
                    break;

                case 2:

                    if (bags.isEmpty()) {
                        System.out.println("No baggage records found.");
                    } else {
                        for (Baggage bag : bags) {
                            bag.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Bag ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (Baggage bag : bags) {

                        if (bag.getBagId() == searchId) {

                            System.out.print("New Status: ");
                            String newStatus = sc.nextLine();

                            bag.setStatus(newStatus);

                            System.out.println("Status updated successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Baggage not found.");
                    }

                    break;

                case 4:

                    System.out.println("Thank you for using the system.");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
