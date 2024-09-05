import java.util.Scanner;

class LudoGame {
    private int alexPoints;
    private int nikilPoints;
    private int samPoints;

    // Constructor to initialize the points of the players
    public LudoGame(int alexPoints, int nikilPoints, int samPoints) {
        this.alexPoints = alexPoints;
        this.nikilPoints = nikilPoints;
        this.samPoints = samPoints;
    }

    // Method to determine if a point is valid
    private boolean isValidPoint(int points) {
        return points >= 0 && points <= 50;
    }

    // Method to determine the winner
    public void determineWinner() {
        // Check for a tie
        if (alexPoints == nikilPoints && nikilPoints == samPoints) {
            System.out.println("The game is a tie");
            return;
        } else if (alexPoints == nikilPoints || alexPoints == samPoints || nikilPoints == samPoints) {
            System.out.println("The game is a tie");
            return;
        }

        // Determine the winner
        if (alexPoints > nikilPoints && alexPoints > samPoints) {
            System.out.println("Alex scored " + alexPoints + " points and won the game");
        } else if (nikilPoints > alexPoints && nikilPoints > samPoints) {
            System.out.println("Nikil scored " + nikilPoints + " points and won the game");
        } else {
            System.out.println("Sam scored " + samPoints + " points and won the game");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validation for Alex's points
        System.out.println("Enter Alex points");
        int alexPoints = scanner.nextInt();
        if (alexPoints < 0 || alexPoints > 50) {
            System.out.println(alexPoints + " is an invalid number");
            scanner.close();
            return;
        }

        // Input and validation for Nikil's points
        System.out.println("Enter Nikil points");
        int nikilPoints = scanner.nextInt();
        if (nikilPoints < 0 || nikilPoints > 50) {
            System.out.println(nikilPoints + " is an invalid number");
            scanner.close();
            return;
        }

        // Input and validation for Sam's points
        System.out.println("Enter Sam points");
        int samPoints = scanner.nextInt();
        if (samPoints < 0 || samPoints > 50) {
            System.out.println(samPoints + " is an invalid number");
            scanner.close();
            return;
        }

        // Create an instance of LudoGame and determine the winner
        LudoGame game = new LudoGame(alexPoints, nikilPoints, samPoints);
        game.determineWinner();

        scanner.close();
    }
}
