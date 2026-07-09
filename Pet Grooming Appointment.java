import java.util.ArrayList;
import java.util.Scanner;

public class PetGroomingAppointment {

    String ownerName;
    String petName;
    String service;
    double charge;

    PetGroomingAppointment(String ownerName, String petName, String service, double charge) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.service = service;
        this.charge = charge;
    }

    void display() {
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Pet Name   : " + petName);
        System.out.println("Service    : " + service);
        System.out.println("Charge     : " + charge);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<PetGroomingAppointment> appointments = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Owner Name: ");
                    String owner = input.nextLine();

                    System.out.print("Pet Name: ");
                    String pet = input.nextLine();

                    System.out.print("Service: ");
                    String service = input.nextLine();

                    System.out.print("Charge: ");
                    double charge = input.nextDouble();

                    appointments.add(new PetGroomingAppointment(owner, pet, service, charge));

                    System.out.println("Appointment Added.");
                    break;

                case 2:

                    if (appointments.isEmpty()) {
                        System.out.println("No Appointments Found.");
                    } else {

                        double totalCharge = 0;

                        for (PetGroomingAppointment appointment : appointments) {
                            appointment.display();
                            totalCharge += appointment.charge;
                            System.out.println();
                        }

                        System.out.println("Total Appointments: " + appointments.size());
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
