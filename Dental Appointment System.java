import java.util.ArrayList;
import java.util.Scanner;

public class DentalAppointmentSystem {

    String patientName;
    String dentistName;
    String appointmentDate;
    String appointmentTime;
    double fee;

    DentalAppointmentSystem(String patientName, String dentistName,
                            String appointmentDate, String appointmentTime, double fee) {
        this.patientName = patientName;
        this.dentistName = dentistName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.fee = fee;
    }

    void display() {
        System.out.println("Patient Name : " + patientName);
        System.out.println("Dentist Name : " + dentistName);
        System.out.println("Date         : " + appointmentDate);
        System.out.println("Time         : " + appointmentTime);
        System.out.println("Fee          : " + fee);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<DentalAppointmentSystem> appointments = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Book Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Patient Name: ");
                    String patient = input.nextLine();

                    System.out.print("Dentist Name: ");
                    String dentist = input.nextLine();

                    System.out.print("Date: ");
                    String date = input.nextLine();

                    System.out.print("Time: ");
                    String time = input.nextLine();

                    System.out.print("Fee: ");
                    double fee = input.nextDouble();

                    appointments.add(new DentalAppointmentSystem(patient, dentist, date, time, fee));

                    System.out.println("Appointment Booked.");
                    break;

                case 2:

                    if (appointments.isEmpty()) {
                        System.out.println("No Appointments Found.");
                    } else {

                        double totalFee = 0;

                        for (DentalAppointmentSystem appointment : appointments) {
                            appointment.display();
                            totalFee += appointment.fee;
                            System.out.println();
                        }

                        System.out.println("Total Appointments: " + appointments.size());
                        System.out.println("Total Fee: " + totalFee);
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
