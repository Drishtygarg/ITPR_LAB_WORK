//3. Write a program to find out factorial of the given number by creating a user defined method.
    import java.util.Scanner;

    public class FactorialProgram {
    
        // USER-DEFINED METHOD to calculate factorial
        public static long findFactorial(int n) {
            long fact = 1;
    
            for (int i = 1; i <= n; i++) {
                fact = fact * i;   // multiplying numbers from 1 to n
            }
    
            return fact;   // returning final factorial value
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            // Taking user input
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
    
            sc.close();
    
            // Calling the user-defined method
            long result = findFactorial(num);
    
            // Displaying result
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
     

