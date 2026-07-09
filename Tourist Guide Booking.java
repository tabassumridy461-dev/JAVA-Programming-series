import java.util.ArrayList;
import java.util.Scanner;

public class TouristGuideBooking {

    String touristName;
    String guideName;
    String destination;
    double bookingFee;

    TouristGuideBooking(String touristName, String guideName, String destination, double bookingFee) {
        this.touristName = touristName;
        this.guideName = guideName;
        this.destination = destination;
        this.bookingFee = bookingFee;
    }

    void display() {
        System.out.println("Tourist Name : " + touristName);
        System.out.println("Guide Name   : " + guideName);
        System.out.println("Destination  : " + destination);
        System.out.println("Booking Fee  : " + bookingFee);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<TouristGuideBooking> bookings = new ArrayList<>();

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

                    System.out.print("Tourist Name: ");
                    String tourist = input.nextLine();

                    System.out.print("Guide Name: ");
                    String guide = input.nextLine();

                    System.out.print("Destination: ");
                    String destination = input.nextLine();

                    System.out.print("Booking Fee: ");
                    double fee = input.nextDouble();

                    bookings.add(new TouristGuideBooking(tourist, guide, destination, fee));

                    System.out.println("Booking Added.");
                    break;

                case 2:

                    if (bookings.isEmpty()) {
                        System.out.println("No Bookings Found.");
                    } else {

                        double totalFee = 0;

                        for (TouristGuideBooking booking : bookings) {
                            booking.display();
                            totalFee += booking.bookingFee;
                            System.out.println();
                        }

                        System.out.println("Total Bookings: " + bookings.size());
                        System.out.println("Total Booking Fee: " + totalFee);
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
