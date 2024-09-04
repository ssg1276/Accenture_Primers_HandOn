import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for weight and height
        System.out.println("Enter weight in kg");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter height in cm");
        double height = scanner.nextDouble();
        scanner.nextLine();

        // Calculating BMI
        double bmi = weight / ((height / 100) * (height / 100));

        // Outputting BMI
        System.out.printf("Your BMI is %.2f. ", bmi);

        // Checking BMI category and calculating the amount to reduce or gain
        if (bmi >= 25) {
            System.out.println("You are overweight");
            double reduceKg = bmi - 25;
            System.out.printf("Reduce %.2f kg to be fit\n", reduceKg);
        } else if (bmi >= 18.5) {
            System.out.println("You are fit and healthy");
        } else {
            System.out.println("You are underweight");
            double gainKg = 18.5 - bmi;
            System.out.printf("Gain %.2f kg to be fit\n", gainKg);
        }

        scanner.close();
    }
}