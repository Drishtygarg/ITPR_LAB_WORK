//WAP to calculate the area and perimeter of the rectangle. use custom exception
// Custom Exception to handle invalid dimensions
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

public class RectangleCalculator {

    // Method to calculate area
    public static double calculateArea(double length, double width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Length and Width must be positive values.");
        }
        return length * width;
    }

    // Method to calculate perimeter
    public static double calculatePerimeter(double length, double width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Length and Width must be positive values.");
        }
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        double length = 4;   // we can change these values
        double width = 2;

        try {
            double area = calculateArea(length, width);
            double perimeter = calculatePerimeter(length, width);

            // Display results
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area of Rectangle: " + area);
            System.out.println("Perimeter of Rectangle: " + perimeter);

        } catch (InvalidDimensionException e) {
            // Print custom exception message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
