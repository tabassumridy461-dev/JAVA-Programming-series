import java.util.ArrayList;
import java.util.Scanner;

public class DairyFarm {

    String farmerName;
    double liters;
    double pricePerLiter;

    DairyFarm(String farmerName, double liters, double pricePerLiter) {
        this.farmerName = farmerName;
        this.liters = liters;
        this.pricePerLiter = pricePerLiter;
    }

    double getTotalBill() {
        return liters * pricePerLiter;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Farmer Name : " + farmerName);
        System.out.println("Milk        : " + liters + " Liters");
        System.out.println("Price/Liter : " + pricePerLiter);
        System.out.println("Total Bill  : " + getTotalBill());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<DairyFarm> records = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Dairy Farm Milk Collection System =====");
            System.out.println("1. Add Milk Collection");
            System.out.println("2. View All Records");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Farmer Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Milk (Liters): ");
                    double liters = input.nextDouble();

                    System.out.print("Enter Price Per Liter: ");
                    double price = input.nextDouble();

                    records.add(new DairyFarm(name, liters, price));

                    System.out.println("Milk Collection Added Successfully.");
                    break;

                case 2:

                    if (records.isEmpty()) {
                        System.out.println("No Records Available.");
                    } else {

                        double totalMilk = 0;
                        double totalPayment = 0;

                        System.out.println("\n===== Milk Collection Records =====");

                        for (DairyFarm record : records) {
                            record.display();
                            totalMilk += record.liters;
                            totalPayment += record.getTotalBill();
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Farmers : " + records.size());
                        System.out.println("Total Milk    : " + totalMilk + " Liters");
                        System.out.println("Total Payment : " + totalPayment);
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
