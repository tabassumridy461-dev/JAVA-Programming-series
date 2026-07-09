import java.util.ArrayList;
import java.util.Scanner;

public class RiverWaterLevelTracker {

    String riverName;
    String location;
    double waterLevel;
    String date;

    RiverWaterLevelTracker(String riverName, String location, double waterLevel, String date) {
        this.riverName = riverName;
        this.location = location;
        this.waterLevel = waterLevel;
        this.date = date;
    }

    void display() {
        System.out.println("River Name : " + riverName);
        System.out.println("Location   : " + location);
        System.out.println("Water Level: " + waterLevel + " m");
        System.out.println("Date       : " + date);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<RiverWaterLevelTracker> records = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Record");
            System.out.println("2. View Records");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("River Name: ");
                    String river = input.nextLine();

                    System.out.print("Location: ");
                    String location = input.nextLine();

                    System.out.print("Water Level (m): ");
                    double level = input.nextDouble();
                    input.nextLine();

                    System.out.print("Date: ");
                    String date = input.nextLine();

                    records.add(new RiverWaterLevelTracker(river, location, level, date));

                    System.out.println("Record Added.");
                    break;

                case 2:

                    if (records.isEmpty()) {
                        System.out.println("No Records Found.");
                    } else {

                        double totalLevel = 0;

                        for (RiverWaterLevelTracker record : records) {
                            record.display();
                            totalLevel += record.waterLevel;
                            System.out.println();
                        }

                        System.out.println("Total Records: " + records.size());
                        System.out.println("Average Water Level: " + (totalLevel / records.size()) + " m");
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
