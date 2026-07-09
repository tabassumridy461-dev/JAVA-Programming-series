import java.util.ArrayList;
import java.util.Scanner;

public class NationalIDAppointmentSystem {

    String applicantName;
    String appointmentDate;
    String appointmentTime;
    String serviceType;

    NationalIDAppointmentSystem(String applicantName, String appointmentDate,
                                String appointmentTime, String serviceType) {
        this.applicantName = applicantName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.serviceType = serviceType;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Applicant Name  : " + applicantName);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Appointment Time: " + appointmentTime);
        System.out.println("Service Type    : " + serviceType);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<NationalIDAppointmentSystem> appointments = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== National ID Appointment System =====");
            System.out.println("1. Book Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Applicant Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Appointment Date (DD-MM-YYYY): ");
                    String date = input.nextLine();

                    System.out.print("Enter Appointment Time: ");
                    String time = input.nextLine();

                    System.out.print("Enter Service Type (New ID / Correction / Reissue): ");
                    String service = input.nextLine();

                    appointments.add(new NationalIDAppointmentSystem(name, date, time, service));

                    System.out.println("Appointment Booked Successfully.");
                    break;

                case 2:

                    if (appointments.isEmpty()) {
                        System.out.println("No Appointments Found.");
                    } else {

                        System.out.println("\n===== Appointment List =====");

                        for (NationalIDAppointmentSystem appointment : appointments) {
                            appointment.display();
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Appointments : " + appointments.size());
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
