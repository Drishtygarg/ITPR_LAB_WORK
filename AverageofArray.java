import java.util.Scanner;

public class AverageofArray {

    public static void main(String[] args) {

        // Creating an array of 10 numbers
        int[] numbers = new int[10];

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        // Taking input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        sc.close(); // closing scanner

        // Calculating total sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculating average
        double average = sum / 10.0;

        // Displaying the result
        System.out.println("\nTotal Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

