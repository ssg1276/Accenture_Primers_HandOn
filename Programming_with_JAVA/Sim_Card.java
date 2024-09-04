import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the phone number");
        long phoneNumber = scanner.nextLong();  // Read the phone number
        scanner.nextLine();
        
        int sumOdd = 0;
        int sumEven = 0;

        // Loop to process each digit of the phone number
        while (phoneNumber != 0) {
            int digit = (int) (phoneNumber % 10);  // Extract the last digit
            if (digit % 2 == 0) {
                sumEven += digit;  // If digit is even, add to sumEven
            } else {
                sumOdd += digit;  // If digit is odd, add to sumOdd
            }
            phoneNumber /= 10;  // Remove the last digit
        }

        // Determine which sum is greater or if they are equal
        if (sumOdd == sumEven) {
            System.out.println("Sum of odd and even are equal");
        } else if (sumEven > sumOdd) {
            System.out.println("Sum of even is greater than sum of odd");
        } else {
            System.out.println("Sum of odd is greater than sum of even");
        }

        scanner.close();
    }
}