import java.util.Random;
import java.util.Scanner;

class LuckyWheelGame {

    String playerName;
    int totalCoins = 0;
    int spinCount = 0;

    String[] rewards = {
            "10 Coins",
            "20 Coins",
            "50 Coins",
            "100 Coins",
            "Nothing",
            "Try Again",
            "Gift Box",
            "Jackpot"
    };

    public void startGame() {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        playerName = input.nextLine();

        System.out.println("\nWelcome " + playerName + "!");
        System.out.println("You have 5 chances to spin the Lucky Wheel.");

        while (spinCount < 5) {

            System.out.print("\nPress Enter to Spin...");
            input.nextLine();

            int index = random.nextInt(rewards.length);
            String prize = rewards[index];

            System.out.println("The wheel is spinning...");
            System.out.println("You won: " + prize);

            switch (prize) {

                case "10 Coins":
                    totalCoins += 10;
                    break;

                case "20 Coins":
                    totalCoins += 20;
                    break;

                case "50 Coins":
                    totalCoins += 50;
                    break;

                case "100 Coins":
                    totalCoins += 100;
                    break;

                case "Gift Box":
                    totalCoins += 75;
                    System.out.println("Gift Box Bonus: +75 Coins");
                    break;

                case "Jackpot":
                    totalCoins += 500;
                    System.out.println("Congratulations! JACKPOT!");
                    break;

                case "Try Again":
                    System.out.println("Good luck on your next spin!");
                    break;

                case "Nothing":
                    System.out.println("Better luck next time!");
                    break;
            }

            spinCount++;

            System.out.println("Total Coins: " + totalCoins);
            System.out.println("Spins Left: " + (5 - spinCount));
        }

        System.out.println("\nGame Over!");
        System.out.println("Player: " + playerName);
        System.out.println("Total Coins Earned: " + totalCoins);

        if (totalCoins >= 500) {
            System.out.println("Amazing! You are a Lucky Wheel Master!");
        } else if (totalCoins >= 200) {
            System.out.println("Great Job!");
        } else if (totalCoins >= 100) {
            System.out.println("Good Game!");
        } else {
            System.out.println("Keep trying for bigger rewards!");
        }

        input.close();
    }

    public static void main(String[] args) {

        LuckyWheelGame game = new LuckyWheelGame();
        game.startGame();

    }
}
