import java.util.ArrayList;
import java.util.Scanner;

public class GreenhouseTemperatureLog {

    String date;
    double morningTemp;
    double afternoonTemp;
    double eveningTemp;

    GreenhouseTemperatureLog(String date, double morningTemp, double afternoonTemp, double eveningTemp) {
        this.date = date;
        this.morningTemp = morningTemp;
        this.afternoonTemp = afternoonTemp;
        this.eveningTemp = eveningTemp;
    }

    double getAverageTemperature() {
        return (morningTemp + afternoonTemp + eveningTemp) / 3;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Date              : " + date);
        System.out.println("Morning Temp      : " + morningTemp + " °C");
        System.out.println("Afternoon Temp    : " + afternoonTemp + " °C");
        System.out.println("Evening Temp      : " + eveningTemp + " °C");
        System.out.printf("Average Temp      : %.2f °C%n", getAverageTemperature());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<GreenhouseTemperatureLog> logs = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Greenhouse Temperature Log =====");
            System.out.println("1. Add Temperature Record");
            System.out.println("2. View All Records");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Date (DD-MM-YYYY): ");
                    String date = input.nextLine();

                    System.out.print("Morning Temperature: ");
                    double morning = input.nextDouble();

                    System.out.print("Afternoon Temperature: ");
                    double afternoon = input.nextDouble();

                    System.out.print("Evening Temperature: ");
                    double evening = input.nextDouble();

                    logs.add(new GreenhouseTemperatureLog(date, morning, afternoon, evening));

                    System.out.println("Temperature Record Saved Successfully.");
                    break;

                case 2:

                    if (logs.isEmpty()) {
                        System.out.println("No Temperature Records Found.");
                    } else {

                        double totalAverage = 0;

                        System.out.println("\n===== Temperature Records =====");

                        for (GreenhouseTemperatureLog log : logs) {
                            log.display();
                            totalAverage += log.getAverageTemperature();
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Records : " + logs.size());
                        System.out.printf("Overall Average Temperature : %.2f °C%n",
                                totalAverage / logs.size());
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
