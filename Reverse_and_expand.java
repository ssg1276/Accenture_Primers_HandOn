import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();  // Read the number from user input
        scanner.nextLine();

        // Check if the number is a 4-digit number
        if (number < 1000 || number > 9999) {
            System.out.println(number + " is an invalid number");
        } else {
            // Reverse the 4-digit number
            int reversedNumber = 0;
            int originalNumber = number;
            
            while (number != 0) {
                int digit = number % 10;  // Extract the last digit
                reversedNumber = reversedNumber * 10 + digit;  // Build the reversed number
                number /= 10;  // Remove the last digit
            }

            System.out.println("Reversed number is " + reversedNumber);

            // Expand the reversed number using a different approach
            int factor = 1;  // Factor to calculate place values (1, 10, 100, 1000)
            String expanded = "";

            while (reversedNumber > 0) {
                int digit = reversedNumber % 10;  // Extract the last digit
                if (digit != 0) {  // Only include non-zero terms
                    expanded = (digit * factor) + (expanded.isEmpty() ? "" : "+" + expanded);  // Add to the expanded string
                }
                reversedNumber /= 10;  // Remove the last digit
                factor *= 10;  // Increase the factor by 10 for the next place value
            }

            System.out.println(expanded);
        }

        scanner.close();
    }
}