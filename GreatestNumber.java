//program to find out the greatest number by using user defined method 
import java.util.Scanner; //importing Scanner class for user input

public class GreatestNumber {

    // USER-DEFINED METHOD to find greatest number
    public static int findGreatest(int[] numbers) {
        int max = numbers[0];
        
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > max) {
                max = numbers[index];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int numbers[] = new int[10];  // declaring array of 10 numbers
        Scanner sc = new Scanner(System.in);  // creating scanner object
        
        // Input from user
        System.out.println("Enter any 10 numbers:");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt();
        }

        sc.close(); // closing scanner to avoid resource leak
        
        // Display numbers
        System.out.println("Numbers are:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " , ");
        }

        // Calling the USER-DEFINED METHOD
        int greatest = findGreatest(numbers);

        // Printing result
        System.out.println("\nGreatest Number : " + greatest);
    }
}




    

