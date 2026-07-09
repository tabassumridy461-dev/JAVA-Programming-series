import java.util.ArrayList;
import java.util.Scanner;

public class CarWashQueueSystem {

    String customerName;
    String carModel;
    String washType;
    double charge;

    CarWashQueueSystem(String customerName, String carModel, String washType, double charge) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.washType = washType;
        this.charge = charge;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Wash Type     : " + washType);
        System.out.println("Charge        : " + charge);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<CarWashQueueSystem> queue = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Car");
            System.out.println("2. View Queue");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Customer Name: ");
                    String customer = input.nextLine();

                    System.out.print("Car Model: ");
                    String model = input.nextLine();

                    System.out.print("Wash Type: ");
                    String wash = input.nextLine();

                    System.out.print("Charge: ");
                    double charge = input.nextDouble();

                    queue.add(new CarWashQueueSystem(customer, model, wash, charge));

                    System.out.println("Car Added.");
                    break;

                case 2:

                    if (queue.isEmpty()) {
                        System.out.println("No Cars in Queue.");
                    } else {

                        double totalCharge = 0;

                        for (CarWashQueueSystem car : queue) {
                            car.display();
                            totalCharge += car.charge;
                            System.out.println();
                        }

                        System.out.println("Total Cars: " + queue.size());
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
