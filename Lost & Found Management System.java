import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private int id;
    private String itemName;
    private String category;
    private String location;
    private String status;

    public Item(int id, String itemName, String category, String location, String status) {
        this.id = id;
        this.itemName = itemName;
        this.category = category;
        this.location = location;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void display() {
        System.out.println("------------------------------------");
        System.out.println("ID       : " + id);
        System.out.println("Item     : " + itemName);
        System.out.println("Category : " + category);
        System.out.println("Location : " + location);
        System.out.println("Status   : " + status);
    }
}

public class LostAndFoundManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Lost & Found Management System =====");
            System.out.println("1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View All Items");
            System.out.println("4. Mark Item as Returned");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item ID: ");
                    int lostId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String lostName = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String lostCategory = sc.nextLine();

                    System.out.print("Last Seen Location: ");
                    String lostLocation = sc.nextLine();

                    items.add(new Item(lostId, lostName, lostCategory, lostLocation, "Lost"));

                    System.out.println("Lost item reported successfully.");
                    break;

                case 2:
                    System.out.print("Enter Item ID: ");
                    int foundId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String foundName = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String foundCategory = sc.nextLine();

                    System.out.print("Found Location: ");
                    String foundLocation = sc.nextLine();

                    items.add(new Item(foundId, foundName, foundCategory, foundLocation, "Found"));

                    System.out.println("Found item reported successfully.");
                    break;

                case 3:
                    if (items.isEmpty()) {
                        System.out.println("No items available.");
                    } else {
                        for (Item item : items) {
                            item.display();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Item item : items) {
                        if (item.getId() == searchId) {
                            item.setStatus("Returned");
                            System.out.println("Item marked as Returned.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
