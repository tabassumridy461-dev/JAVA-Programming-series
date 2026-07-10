import java.util.Random;
import java.util.Scanner;

class SpaceMissionSimulator {

    String captainName;
    int fuel = 100;
    int hull = 100;
    int oxygen = 100;
    int minerals = 0;
    int missions = 0;

    Random random = new Random();

    public void travelPlanet() {

        if (fuel < 20) {
            System.out.println("Not enough fuel.");
            return;
        }

        String[] planets = {
                "Mars",
                "Moon",
                "Europa",
                "Titan",
                "Neptune"
        };

        String planet = planets[random.nextInt(planets.length)];

        fuel -= 20;
        oxygen -= 10;
        missions++;

        System.out.println("You traveled to " + planet + ".");

        randomEvent();
    }

    public void collectMinerals() {

        int found = random.nextInt(31) + 20;

        minerals += found;
        oxygen -= 5;

        System.out.println("You collected " + found + " minerals.");

        randomEvent();
    }

    public void refuelShip() {

        if (minerals < 20) {
            System.out.println("You need at least 20 minerals.");
            return;
        }

        minerals -= 20;
        fuel += 30;

        if (fuel > 100)
            fuel = 100;

        System.out.println("Ship refueled.");
    }

    public void repairShip() {

        if (minerals < 15) {
            System.out.println("Not enough minerals.");
            return;
        }

        minerals -= 15;
        hull += 20;

        if (hull > 100)
            hull = 100;

        System.out.println("Hull repaired.");
    }

    public void scanArea() {

        System.out.println("Scanning nearby space...");

        if (random.nextBoolean()) {
            System.out.println("A hidden asteroid contains valuable minerals!");
            minerals += 15;
        } else {
            System.out.println("Nothing unusual was found.");
        }
    }

    public void randomEvent() {

        int event = random.nextInt(4);

        switch (event) {

            case 0:
                System.out.println("Meteor shower damaged your ship.");
                hull -= 15;
                break;

            case 1:
                System.out.println("You discovered extra fuel.");
                fuel += 10;
                if (fuel > 100)
                    fuel = 100;
                break;

            case 2:
                System.out.println("Solar storm reduced oxygen.");
                oxygen -= 10;
                break;

            case 3:
                System.out.println("The journey was smooth.");
                break;
        }

        if (hull < 0)
            hull = 0;

        if (oxygen < 0)
            oxygen = 0;
    }

    public void showStatus() {

        System.out.println("\nCaptain : " + captainName);
        System.out.println("Fuel    : " + fuel);
        System.out.println("Hull    : " + hull);
        System.out.println("Oxygen  : " + oxygen);
        System.out.println("Minerals: " + minerals);
        System.out.println("Missions: " + missions);
    }

    public boolean gameOver() {

        return fuel == 0 || hull == 0 || oxygen == 0;
    }

    public void startGame() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Captain Name: ");
        captainName = input.nextLine();

        int choice;

        while (!gameOver()) {

            showStatus();

            System.out.println("\n1. Travel to Planet");
            System.out.println("2. Collect Minerals");
            System.out.println("3. Refuel Ship");
            System.out.println("4. Repair Ship");
            System.out.println("5. Scan Area");
            System.out.println("6. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    travelPlanet();
                    break;

                case 2:
                    collectMinerals();
                    break;

                case 3:
                    refuelShip();
                    break;

                case 4:
                    repairShip();
                    break;

                case 5:
                    scanArea();
                    break;

                case 6:
                    System.out.println("Mission Ended.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        System.out.println("\nMission Failed!");
        System.out.println("Your spaceship can no longer continue.");

        input.close();
    }

    public static void main(String[] args) {

        SpaceMissionSimulator game = new SpaceMissionSimulator();
        game.startGame();

    }
}
