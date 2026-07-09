import java.util.ArrayList;
import java.util.Scanner;

public class BuffetTableReservation {

    String customerName;
    int tableNumber;
    int numberOfGuests;
    String reservationTime;

    BuffetTableReservation(String customerName, int tableNumber,
                           int numberOfGuests, String reservationTime) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.numberOfGuests = numberOfGuests;
        this.reservationTime = reservationTime;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Table Number  : " + tableNumber);
        System.out.println("Guests        : " + numberOfGuests);
        System.out.println("Time          : " + reservationTime);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<BuffetTableReservation> reservations = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Reserve Table");
            System.out.println("2. View Reservations");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Customer Name: ");
                    String name = input.nextLine();

                    System.out.print("Table Number: ");
                    int table = input.nextInt();

                    System.out.print("Number of Guests: ");
                    int guests = input.nextInt();
                    input.nextLine();

                    System.out.print("Reservation Time: ");
                    String time = input.nextLine();

                    reservations.add(new BuffetTableReservation(name, table, guests, time));

                    System.out.println("Reservation Added.");
                    break;

                case 2:

                    if (reservations.isEmpty()) {
                        System.out.println("No Reservations Found.");
                    } else {

                        int totalGuests = 0;

                        for (BuffetTableReservation reservation : reservations) {
                            reservation.display();
                            totalGuests += reservation.numberOfGuests;
                            System.out.println();
                        }

                        System.out.println("Total Reservations: " + reservations.size());
                        System.out.println("Total Guests: " + totalGuests);
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
