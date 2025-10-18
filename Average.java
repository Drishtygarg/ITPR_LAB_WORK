//WAP to cal the average of the numbers
import java.util.Scanner;
class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i]; // add to sum
        }
        double average = sum / 10.0; // divide total sum by 10
        System.out.println("Average is: " + average);
    }
}
    
