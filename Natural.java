//WAP to add the natural numbers
import java.util.Scanner;

class Natural {
    static int sumOfNaturalNumbers(int n)// Method to calculate the sum of the first 'n' natural numbers
     {
        int sum = 0;
        // Loop from 1 up to and including the input number 'n'
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        //Return the final calculated sum of the numbers
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
            