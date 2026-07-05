import java.util.ArrayList;
import java.util.Scanner;

class Booking {

    private int bookingId;
    private String customerName;
    private String packageName;
    private String bookingDate;
    private double amount;
    private String status;

    public Booking(int bookingId, String customerName, String packageName,
                   String bookingDate, double amount, String status) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.packageName = packageName;
        this.bookingDate = bookingDate;
        this.amount = amount;
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void display() {

        System.out.println("------------------------------");
        System.out.println("Booking ID   : " + bookingId);
        System.out.println("Customer     : " + customerName);
        System.out.println("Package      : " + packageName);
        System.out.println("Booking Date : " + bookingDate);
        System.out.println("Amount       : $" + amount);
        System.out.println("Status       : " + status);
    }
}

public class PhotoStudioBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Booking> bookings = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Photo Studio Booking System =====");
            System.out.println("1. Add Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Update Booking Status");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Booking ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Package Name: ");
                    String packageName = sc.nextLine();

                    System.out.print("Booking Date: ");
                    String date = sc.nextLine();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Status (Pending/Confirmed/Completed): ");
                    String status = sc.nextLine();

                    bookings.add(new Booking(id, customer, packageName, date, amount, status));

                    System.out.println("Booking added successfully.");
                    break;

                case 2:

                    if (bookings.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {

                        for (Booking booking : bookings) {
                            booking.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Booking ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (Booking booking : bookings) {

                        if (booking.getBookingId() == searchId) {

                            System.out.print("New Status: ");
                            String newStatus = sc.nextLine();

                            booking.setStatus(newStatus);

                            System.out.println("Booking updated successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Booking not found.");
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
