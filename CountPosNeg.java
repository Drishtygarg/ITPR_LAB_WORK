//
import java.util.Scanner;

public class CountPosNeg {

    public static void main(String[] args) {

        // Array to store 10 numbers
        int[] numbers = new int[10];

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        // Taking input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        sc.close();

        int positiveCount = 0;
        int negativeCount = 0;

        // Checking positive and negative numbers
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positiveCount++;
            } 
            else if (numbers[i] < 0) {
                negativeCount++;
            }
        }

        // Displaying results
        System.out.println("\nTotal Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
    }
}
