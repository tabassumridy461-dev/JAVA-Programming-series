import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        while (true) {

            System.out.println("\n===== Rock Paper Scissors =====");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            if (choice == 4) {
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice!");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.print("You chose: ");
            printChoice(choice);

            System.out.print("Computer chose: ");
            printChoice(computerChoice);

            if (choice == computerChoice) {

                System.out.println("It's a Draw!");

            } else if ((choice == 1 && computerChoice == 3) ||
                       (choice == 2 && computerChoice == 1) ||
                       (choice == 3 && computerChoice == 2)) {

                System.out.println("You Win!");
                playerScore++;

            } else {

                System.out.println("Computer Wins!");
                computerScore++;
            }

            System.out.println("\nScore");
            System.out.println("You: " + playerScore);
            System.out.println("Computer: " + computerScore);
        }

        System.out.println("\nFinal Score");
        System.out.println("You: " + playerScore);
        System.out.println("Computer: " + computerScore);
        System.out.println("Thanks for playing!");

        input.close();
    }

    static void printChoice(int choice) {

        switch (choice) {

            case 1:
                System.out.println("Rock");
                break;

            case 2:
                System.out.println("Paper");
                break;

            case 3:
                System.out.println("Scissors");
                break;
        }
    }
}
