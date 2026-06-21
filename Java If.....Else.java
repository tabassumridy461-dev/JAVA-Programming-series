public class IfElse {
    public static void main(String[] args) {

        // if
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // else
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // else if
        int marks = 75;
        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // Short Hand If...Else (Ternary Operator)
        int number = 10;
        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println(result);

        // Nested If
        int num = 15;
        if (num > 0) {
            if (num < 20) {
                System.out.println("Number is between 1 and 19");
            }
        }

        // Logical Operators
        int x = 5;
        int y = 10;

        if (x < 10 && y > 5) {
            System.out.println("Both conditions are true");
        }

        // Real-Life Example
        int score = 85;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good");
        } else {
            System.out.println("Need Improvement");
        }
    }
}
