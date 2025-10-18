//WAP to count and display the total no of positive and negative integers
import java.util.Scanner;
 class Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10]; // Declare an array to store 10 integers
        int Count1 = 0, Count2 = 0; // Count1 is for positive, Count2 is for negative

        System.out.println("Enter 10 numbers:");
        // Loop 10 times to read all numbers
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            // Check if the number is positive
            if (numbers[i] > 0) {
                Count1++;
            // Check if the number is negative
            } else if (numbers[i] < 0) {
                Count2++;
            }
        }

        System.out.println("Total Positive Numbers: " + Count1);
        System.out.println("Total Negative Numbers: " + Count2);

        sc.close();
    }
}
