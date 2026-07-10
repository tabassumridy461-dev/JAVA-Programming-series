import java.util.Random;
import java.util.Scanner;

class RobotFactorySimulator {

    String factoryName;

    int money = 1000;
    int robots = 0;
    int reputation = 50;
    int completedOrders = 0;

    Random random = new Random();

    public void buildRobot() {

        if (money >= 200) {

            money -= 200;
            robots++;

            System.out.println("A new robot has been built.");

        } else {

            System.out.println("Not enough money.");

        }

    }

    public void deliverOrder() {

        if (robots == 0) {

            System.out.println("No robots available.");
            return;

        }

        robots--;

        int payment = random.nextInt(301) + 200;

        money += payment;
        reputation += 5;
        completedOrders++;

        if (reputation > 100) {
            reputation = 100;
        }

        System.out.println("Order completed.");
        System.out.println("Earned $" + payment);

    }

    public void upgradeFactory() {

        if (money >= 500) {

            money -= 500;
            reputation += 10;

            if (reputation > 100) {
                reputation = 100;
            }

            System.out.println("Factory upgraded.");

        } else {

            System.out.println("Not enough money.");

        }

    }

    public void advertiseFactory() {

        if (money >= 150) {

            money -= 150;

            int newOrders = random.nextInt(4) + 2;

            System.out.println("Advertisement successful.");
            System.out.println(newOrders + " new customers arrived.");

            reputation += 2;

        } else {

            System.out.println("Not enough money.");

        }

    }

    public void showStatus() {

        System.out.println("\nFactory Name : " + factoryName);
        System.out.println("Money        : $" + money);
        System.out.println("Robots       : " + robots);
        System.out.println("Reputation   : " + reputation + "%");
        System.out.println("Orders       : " + completedOrders);

    }

    public boolean gameWon() {

        return money >= 10000 && completedOrders >= 20;
    }

    public void startGame() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Factory Name: ");
        factoryName = input.nextLine();

        int choice;

        while (!gameWon()) {

            System.out.println("\n===== Robot Factory Simulator =====");
            System.out.println("1. Build Robot");
            System.out.println("2. Deliver Order");
            System.out.println("3. Upgrade Factory");
            System.out.println("4. Advertise Factory");
            System.out.println("5. Show Status");
            System.out.println("6. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    buildRobot();
                    break;

                case 2:
                    deliverOrder();
                    break;

                case 3:
                    upgradeFactory();
                    break;

                case 4:
                    advertiseFactory();
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
        System.out.println("Your factory is now the world's leading robot manufacturer!");

        input.close();
    }

    public static void main(String[] args) {

        RobotFactorySimulator game = new RobotFactorySimulator();
        game.startGame();

    }

}
