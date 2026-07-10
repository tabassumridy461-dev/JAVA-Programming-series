import java.util.Scanner;

class ThemeParkManager {

    String parkName;
    int money = 1000;
    int visitors = 0;
    int rides = 1;
    int rating = 50;

    public void buildRide() {

        if (money >= 500) {

            money -= 500;
            rides++;
            rating += 5;

            if (rating > 100) {
                rating = 100;
            }

            System.out.println("A new ride has been built!");

        } else {

            System.out.println("Not enough money.");

        }

    }

    public void sellTickets() {

        int income = visitors * 20;

        money += income;

        System.out.println("Ticket sales earned $" + income);

    }

    public void attractVisitors() {

        int newVisitors = rides * 25;

        visitors += newVisitors;

        rating += 2;

        if (rating > 100) {
            rating = 100;
        }

        System.out.println(newVisitors + " new visitors arrived.");

    }

    public void upgradePark() {

        if (money >= 300) {

            money -= 300;
            rating += 10;

            if (rating > 100) {
                rating = 100;
            }

            System.out.println("Park upgraded successfully.");

        } else {

            System.out.println("Not enough money.");

        }

    }

    public void showStatus() {

        System.out.println("\nPark Name : " + parkName);
        System.out.println("Money     : $" + money);
        System.out.println("Visitors  : " + visitors);
        System.out.println("Rides     : " + rides);
        System.out.println("Rating    : " + rating + "%");

    }

    public boolean gameWon() {

        return money >= 10000;
    }

    public void startGame() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Theme Park Name: ");
        parkName = input.nextLine();

        int choice;

        while (!gameWon()) {

            System.out.println("\n===== Theme Park Manager =====");
            System.out.println("1. Build Ride");
            System.out.println("2. Attract Visitors");
            System.out.println("3. Sell Tickets");
            System.out.println("4. Upgrade Park");
            System.out.println("5. Show Status");
            System.out.println("6. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    buildRide();
                    break;

                case 2:
                    attractVisitors();
                    break;

                case 3:
                    sellTickets();
                    break;

                case 4:
                    upgradePark();
                    break;

                case 5:
                    showStatus();
                    break;

                case 6:
                    System.out.println("Game Ended.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }

        }

        System.out.println("\nCongratulations!");
        System.out.println("Your Theme Park became the most popular park!");
        System.out.println("Final Money: $" + money);

        input.close();
    }

    public static void main(String[] args) {

        ThemeParkManager game = new ThemeParkManager();
        game.startGame();

    }
}
