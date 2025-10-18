//WAP to perform the basic operations on the number
import java.util.Scanner;

class Operation {

    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to find difference
    static int difference(int a, int b) {
        return a - b;
    }

    // Method to find product
    static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Addition: " + add(x, y));
        System.out.println("Difference: " + difference(x, y));
        System.out.println("Product: " + product(x, y));
    }
}
