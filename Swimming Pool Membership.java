import java.util.ArrayList;
import java.util.Scanner;

public class SwimmingPoolMembership {

    String memberName;
    String membershipType;
    int duration;
    double fee;

    SwimmingPoolMembership(String memberName, String membershipType, int duration, double fee) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
        this.fee = fee;
    }

    void display() {
        System.out.println("Member Name    : " + memberName);
        System.out.println("Membership     : " + membershipType);
        System.out.println("Duration       : " + duration + " Months");
        System.out.println("Fee            : " + fee);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<SwimmingPoolMembership> members = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Member Name: ");
                    String name = input.nextLine();

                    System.out.print("Membership Type: ");
                    String type = input.nextLine();

                    System.out.print("Duration (Months): ");
                    int duration = input.nextInt();

                    System.out.print("Fee: ");
                    double fee = input.nextDouble();

                    members.add(new SwimmingPoolMembership(name, type, duration, fee));

                    System.out.println("Member Added.");
                    break;

                case 2:

                    if (members.isEmpty()) {
                        System.out.println("No Members Found.");
                    } else {

                        double totalFee = 0;

                        for (SwimmingPoolMembership member : members) {
                            member.display();
                            totalFee += member.fee;
                            System.out.println();
                        }

                        System.out.println("Total Members: " + members.size());
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
