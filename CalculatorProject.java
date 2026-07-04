import java.util.Scanner;

public class Calculator {

    // Method for Addition
    static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====== Simple Java Calculator ======");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\nChoose Operation");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 2:
                result = subtract(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 3:
                result = multiply(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 4:
                result = divide(num1, num2);
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        input.close();
    }
}
