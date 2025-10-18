//WAP to calculate the area and perimeter of the triangle
    import java.util.Scanner;
class Triangle {

    // Method to calculate area
    static double area(double base, double height) {
        return (0.5 * base * height);
    }

    // Method to calculate perimeter
    static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for area
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        // Input for perimeter
        System.out.print("Enter side A: ");
        double a = sc.nextDouble();
        System.out.print("Enter side B: ");
        double b = sc.nextDouble();
        System.out.print("Enter side C: ");
        double c = sc.nextDouble();

        double areaResult = area(base, height);
double perimeterResult = perimeter(a, b, c);

        System.out.println("Area of triangle: " + areaResult);
        System.out.println("Perimeter of triangle: " + perimeterResult);

        sc.close();
    }
}

