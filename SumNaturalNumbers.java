//2. Write a program to find out sum of first n natural number by creating  user defined method.
import java.util.Scanner;

public class SumNaturalNumbers {

    // USER-DEFINED METHOD to calculate sum of first n natural numbers
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;  // adding numbers 1 to n
        }

        return sum;   // returning the final sum
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        sc.close();

        // Calling user-defined method
        int result = findSum(n);

        // Displaying result
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
