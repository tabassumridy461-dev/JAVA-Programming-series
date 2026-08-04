import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        System.out.println("Enter 5 elements for the first array:");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = input.nextInt();
        }

        System.out.println("Enter 5 elements for the second array:");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = input.nextInt();
        }

        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[firstArray.length + i] = secondArray[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        input.close();
    }
}
