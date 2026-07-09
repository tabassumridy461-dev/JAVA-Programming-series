import java.util.ArrayList;
import java.util.Scanner;

public class BeautySalonBooking {

    String customerName;
    String service;
    String appointmentDate;
    String appointmentTime;
    double serviceCharge;

    BeautySalonBooking(String customerName, String service, String appointmentDate,
                       String appointmentTime, double serviceCharge) {
        this.customerName = customerName;
        this.service = service;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.serviceCharge = serviceCharge;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Service       : " + service);
        System.out.println("Date          : " + appointmentDate);
        System.out.println("Time          : " + appointmentTime);
        System.out.println("Charge        : " + serviceCharge);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<BeautySalonBooking> bookings = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Booking");
            System.out.println("2. View Bookings");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Customer Name: ");
                    String name = input.nextLine();

                    System.out.print("Service: ");
                    String service = input.nextLine();

                    System.out.print("Date: ");
                    String date = input.nextLine();

                    System.out.print("Time: ");
                    String time = input.nextLine();

                    System.out.print("Charge: ");
                    double charge = input.nextDouble();

                    bookings.add(new BeautySalonBooking(name, service, date, time, charge));

                    System.out.println("Booking Added.");
                    break;

                case 2:

                    if (bookings.isEmpty()) {
                        System.out.println("No Bookings Found.");
                    } else {

                        double totalCharge = 0;

                        for (BeautySalonBooking booking : bookings) {
                            booking.display();
                            totalCharge += booking.serviceCharge;
                            System.out.println();
                        }

                        System.out.println("Total Bookings: " + bookings.size());
                        System.out.println("Total Charge: " + totalCharge);
                    }

                    break;

                case 3:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 3);

        input.close();
    }
}
