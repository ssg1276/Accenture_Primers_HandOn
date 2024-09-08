import java.util.Scanner;

 class VolumeCalculator {
    // Method to calculate the volume of a cylinder
    public double calculateVolume(double radius, double height) {
        // Volume of the cylinder formula: π * radius^2 * height
        return 3.14 * radius * radius * height;
    }

    // Method to calculate the volume of a cuboid
    public double calculateVolume(int length, int breadth, int height) {
        // Volume of the cuboid formula: length * breadth * height
        return length * breadth * height;
    }
 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator volumeCalculator = new VolumeCalculator();

        System.out.println("Enter the choice");
        System.out.println("1. Find Volume For Cylinder");
        System.out.println("2. Find Volume For Cuboid");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Calculating the volume of a cylinder
            System.out.println("Enter the radius");
            double radius = scanner.nextDouble();
            System.out.println("Enter the height");
            double height = scanner.nextDouble();

            double volume = volumeCalculator.calculateVolume(radius, height);
            System.out.printf("Volume of the Cylinder is %.2f\n", volume);
        } else if (choice == 2) {
            // Calculating the volume of a cuboid
            System.out.println("Enter the length");
            int length = scanner.nextInt();
            System.out.println("Enter the breadth");
            int breadth = scanner.nextInt();
            System.out.println("Enter the height");
            int height = scanner.nextInt();

            double volume = volumeCalculator.calculateVolume(length, breadth, height);
            System.out.printf("Volume of the Cuboid is %.2f\n", volume);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

