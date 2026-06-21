public class Scope {

    public static void main(String[] args) {

        // Method Scope
        int x = 100;
        System.out.println("Method Scope:");
        System.out.println("x = " + x);

        // Block Scope
        System.out.println("\nBlock Scope:");

        {
            int y = 200;
            System.out.println("y = " + y);
        }

        // For Loop Scope
        System.out.println("\nFor Loop Scope:");

        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        // Variables y and i cannot be used here
        // because they are out of scope.
    }
}
