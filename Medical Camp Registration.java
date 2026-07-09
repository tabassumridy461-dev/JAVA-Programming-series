import java.util.ArrayList;
import java.util.Scanner;

public class MedicalCampRegistration {

    String patientName;
    int age;
    String gender;
    String disease;

    MedicalCampRegistration(String patientName, int age, String gender, String disease) {
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age          : " + age);
        System.out.println("Gender       : " + gender);
        System.out.println("Disease      : " + disease);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<MedicalCampRegistration> patients = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Patient Name: ");
                    String name = input.nextLine();

                    System.out.print("Age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Gender: ");
                    String gender = input.nextLine();

                    System.out.print("Disease: ");
                    String disease = input.nextLine();

                    patients.add(new MedicalCampRegistration(name, age, gender, disease));

                    System.out.println("Patient Registered.");
                    break;

                case 2:

                    if (patients.isEmpty()) {
                        System.out.println("No Patients Found.");
                    } else {

                        for (MedicalCampRegistration patient : patients) {
                            patient.display();
                            System.out.println();
                        }

                        System.out.println("Total Patients: " + patients.size());
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
