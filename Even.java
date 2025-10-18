//WAP to find the even numbers from the given numbers
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers; //declaration of array
        numbers = new int[20]; // intialize array of 20 numbers
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display even numbers
        System.out.println("Even numbers are:");
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        sc.close();
    }
}
