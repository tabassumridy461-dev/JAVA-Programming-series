public class ForLoop {
    public static void main(String[] args) {

        // 1. For Loop
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 2. Nested Loops
        System.out.println("\n=== Nested Loops ===");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. For-Each Loop
        System.out.println("\n=== For-Each Loop ===");
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 4. Real-Life Example (Shopping Cart Total)
        System.out.println("\n=== Real-Life Example ===");
        int[] prices = {100, 250, 75, 300};
        int total = 0;

        for (int price : prices) {
            total += price;
        }

        System.out.println("Total Bill = $" + total);

        // 5. Code Challenge (Multiplication Table)
        System.out.println("\n=== Code Challenge ===");
        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
