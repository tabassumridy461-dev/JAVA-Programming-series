import java.util.ArrayList;
import java.util.Scanner;

public class IceCreamFactory {

    String flavor;
    int quantity;
    double costPerBox;

    IceCreamFactory(String flavor, int quantity, double costPerBox) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.costPerBox = costPerBox;
    }

    double getProductionCost() {
        return quantity * costPerBox;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Flavor          : " + flavor);
        System.out.println("Boxes Produced  : " + quantity);
        System.out.println("Cost Per Box    : " + costPerBox);
        System.out.println("Production Cost : " + getProductionCost());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<IceCreamFactory> productions = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Ice Cream Factory Production =====");
            System.out.println("1. Add Production");
            System.out.println("2. View Production Report");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Flavor: ");
                    String flavor = input.nextLine();

                    System.out.print("Enter Boxes Produced: ");
                    int quantity = input.nextInt();

                    System.out.print("Enter Cost Per Box: ");
                    double cost = input.nextDouble();

                    productions.add(new IceCreamFactory(flavor, quantity, cost));

                    System.out.println("Production Added Successfully.");
                    break;

                case 2:

                    if (productions.isEmpty()) {
                        System.out.println("No Production Records Found.");
                    } else {

                        int totalBoxes = 0;
                        double totalCost = 0;

                        System.out.println("\n===== Production Report =====");

                        for (IceCreamFactory production : productions) {
                            production.display();
                            totalBoxes += production.quantity;
                            totalCost += production.getProductionCost();
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Flavors : " + productions.size());
                        System.out.println("Total Boxes   : " + totalBoxes);
                        System.out.println("Total Cost    : " + totalCost);
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
