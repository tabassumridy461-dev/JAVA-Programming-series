public class Array {
    public static void main(String[] args) {

        // ==========================================
        // Real-Life Example: School Student Records
        // Covers:
        // 1. Arrays
        // 2. Loop Through an Array
        // 3. Real-Life Example
        // 4. Multidimensional Arrays
        // 5. Code Challenge
        // ==========================================

        // 1. Arrays
        String[] students = {"John", "Emma", "David", "Sophia"};
        int[] marks = {85, 92, 78, 88};

        System.out.println("=== Student Records ===");

        // 2. Loop Through an Array
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " scored " + marks[i]);
        }

        // Calculate total and average marks
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.length;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);

        // 3. Real-Life Example
        System.out.println("\n=== Highest Scoring Student ===");

        int highestMark = marks[0];
        String topStudent = students[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highestMark) {
                highestMark = marks[i];
                topStudent = students[i];
            }
        }

        System.out.println("Top Student: " + topStudent);
        System.out.println("Highest Mark: " + highestMark);

        // 4. Multidimensional Arrays
        System.out.println("\n=== Marks in Multiple Subjects ===");

        String[] subjects = {"Math", "Science", "English"};

        int[][] studentMarks = {
                {85, 90, 88}, // John
                {92, 95, 91}, // Emma
                {78, 80, 75}, // David
                {88, 89, 93}  // Sophia
        };

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ": ");

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + "=" + studentMarks[i][j] + " ");
            }

            System.out.println();
        }

        // 5. Code Challenge
        System.out.println("\n=== Code Challenge ===");
        System.out.println("Find students with average >= 90");

        for (int i = 0; i < studentMarks.length; i++) {

            int sum = 0;

            for (int j = 0; j < studentMarks[i].length; j++) {
                sum += studentMarks[i][j];
            }

            double avg = (double) sum / studentMarks[i].length;

            if (avg >= 90) {
                System.out.println(students[i] + " -> Average: " + avg);
            }
        }
    }
}
