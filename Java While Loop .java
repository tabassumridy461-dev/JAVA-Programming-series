public class WhileLoop {
    public static void main(String[] args) {

        // While Loop Example
        System.out.println("While Loop:");
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop Example
        System.out.println("\nDo-While Loop:");
        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // Real-Life Example: Countdown
        System.out.println("\nCountdown:");
        int count = 5;

        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("Go!");

        // Code Challenge: Sum of 1 to 10
        System.out.println("\nSum of 1 to 10:");
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }

        System.out.println("Sum = " + sum);
    }
}
