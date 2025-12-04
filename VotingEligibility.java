// Write a program to a person is eligible for voting or not. A person will be eligible if his age is greater or equals to 18. Use Custom Exception
// Custom Exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  // Pass message to parent Exception class
    }
}

public class VotingEligibility {

    // Method to check voting eligibility
    public static void checkEligibility(int age) throws InvalidAgeException {
        
        // If age is less than 0, throw custom exception
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }

        // If age is less than 18, throw custom exception
        if (age < 18) {
            throw new InvalidAgeException("Person is NOT eligible for voting.");
        }

        // If age is valid and >=18
        System.out.println("Person is eligible for voting.");
    }

    public static void main(String[] args) {

        int age = 26;   // We can change the age here

        try {
            checkEligibility(age);   // Call method

        } catch (InvalidAgeException e) {
            // Display the custom exception message
            System.out.println("Error: " + e.getMessage());
        }
    }
}

