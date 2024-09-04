import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day");
        int day = scanner.nextInt();  // Read the day from user input
        scanner.nextLine();
        
        // Check if the input day is valid (between 1 and 30)
        if (day <= 0 || day > 30) {
            System.out.println(day + " is invalid day");
        } else {
            // Calculate the Pell number for the given day
            int pellNumber = 0; // Initialize pell number
            
            if (day == 1) {
                pellNumber = 1; // Number of eggs on day 1
            } else if (day == 2) {
                pellNumber = 2; // Number of eggs on day 2
            } else {
                int pellMinusTwo = 1;  // P(1)
                int pellMinusOne = 2;  // P(2)
                int pellCurrent = 0;

                // Compute Pell number using the iterative approach
                for (int i = 3; i <= day; i++) {
                    pellCurrent = 2 * pellMinusOne + pellMinusTwo;  // P(n) = 2 * P(n-1) + P(n-2)
                    pellMinusTwo = pellMinusOne;  // Update P(n-2) for the next iteration
                    pellMinusOne = pellCurrent;   // Update P(n-1) for the next iteration
                }
                pellNumber = pellCurrent;
            }

            // Print the result for the valid day
            System.out.println("Number of eggs in " + day + "th day is " + pellNumber);
        }

        scanner.close();
    }
}