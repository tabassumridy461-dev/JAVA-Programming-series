import java.util.ArrayList;
import java.util.Scanner;

class Order {
    private int orderId;
    private String customerName;
    private String itemName;
    private int quantity;
    private double price;

    public Order(int orderId, String customerName, String itemName, int quantity, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotal() {
        return quantity * price;
    }

    public void displayOrder() {
        System.out.println("----------------------------");
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Item          : " + itemName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : $" + price);
        System.out.println("Total Bill    : $" + getTotal());
    }
}

public class BakeryOrderManagementSystem {

    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addOrder() {

        System.out.print("Order ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Customer Name: ");
        String customer = input.nextLine();

        System.out.print("Item Name: ");
        String item = input.nextLine();

        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        System.out.print("Price per Item: ");
        double price = input.nextDouble();

        orders.add(new Order(id, customer, item, quantity, price));

        System.out.println("Order added successfully.\n");
    }

    public static void viewOrders() {

        if (orders.isEmpty()) {
            System.out.println("No orders available.\n");
            return;
        }

        for (Order order : orders) {
            order.displayOrder();
        }

        System.out.println();
    }

    public static void searchOrder() {

        System.out.print("Enter Order ID: ");
        int id = input.nextInt();

        for (Order order : orders) {
            if (order.getOrderId() == id) {
                order.displayOrder();
                return;
            }
        }

        System.out.println("Order not found.\n");
    }

    public static void calculateSales() {

        double totalSales = 0;

        for (Order order : orders) {
            totalSales += order.getTotal();
        }

        System.out.println("Total Sales: $" + totalSales + "\n");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("===== Bakery Order Management System =====");
            System.out.println("1. Add Order");
            System.out.println("2. View Orders");
            System.out.println("3. Search Order");
            System.out.println("4. Calculate Total Sales");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addOrder();
                    break;

                case 2:
                    viewOrders();
                    break;

                case 3:
                    searchOrder();
                    break;

                case 4:
                    calculateSales();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.\n");
            }

        } while (choice != 5);
    }
}
