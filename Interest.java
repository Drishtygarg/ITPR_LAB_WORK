import java.util.Scanner;

class Interest {
    float principal, rate, time;
    // Constructor: executed when an 'Interest' object is created
    Interest() {
        Scanner sc = new Scanner(System.in);//creating object of the scanner class
        System.out.print("Enter Principal amount: ");
        principal = sc.nextFloat();
        System.out.print("Enter Rate of interest: ");
        rate = sc.nextFloat();
        System.out.print("Enter Time (in years): ");
        time = sc.nextFloat();
    }
    // Method to calculate the Simple Interest (SI)
    float calculateSI() {
        return (principal * rate * time) / 100;
    }
}
class SimpleInterest {
    public static void main(String[] args) {
        // Create an object of the Interest class
        Interest obj = new Interest();
        System.out.println("Simple Interest = " + obj.calculateSI());
    }
}