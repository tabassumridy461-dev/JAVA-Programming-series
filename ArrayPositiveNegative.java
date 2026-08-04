import java.util.Scanner;

public class ArrayPositiveNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers = " + positiveCount);
        System.out.println("Negative numbers = " + negativeCount);
        System.out.println("Zero = " + zeroCount);

        input.close();
    }
}
