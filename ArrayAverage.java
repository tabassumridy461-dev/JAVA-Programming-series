import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;

        System.out.println("Average = " + average);

        input.close();
    }
}
