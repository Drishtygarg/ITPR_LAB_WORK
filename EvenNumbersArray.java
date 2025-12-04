import java.util.Scanner;

public class EvenNumbersArray {

    public static void main(String[] args) {

        // Creating array to store 20 numbers
        int[] numbers = new int[20];

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking 20 numbers as input from user
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        sc.close(); // closing scanner to avoid resource leak

        // Displaying even numbers
        System.out.println("\nEven numbers are:");

        for (int i = 0; i < numbers.length; i++) {
            // Checking if number is even
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
