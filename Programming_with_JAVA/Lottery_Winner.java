import java.util.Scanner;

class LotteryTicket {
    private String ticketId;
    private String unluckyCode;

    // Constructor to initialize ticketId and unluckyCode
    public LotteryTicket(String ticketId, String unluckyCode) {
        this.ticketId = ticketId;
        this.unluckyCode = unluckyCode;
    }

    // Method to check the luck of the ticket
    public String checkLuck() {
        int count = 0;
        int index = 0;

        // Count occurrences of the unlucky code in the ticket ID
        while ((index = ticketId.indexOf(unluckyCode, index)) != -1) {
            count++;
            index += unluckyCode.length();
        }

        if (count == 0) {
            return ticketId + " is lucky ticket";
        } else if (count < 3) {
            return ticketId + " is partially lucky";
        } else {
            return ticketId + " is unlucky ticket";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter the ticket Id");
        String ticketId = scanner.nextLine();

        System.out.println("Enter the unlucky code");
        String unluckyCode = scanner.nextLine();

        // Create an instance of LotteryTicket
        LotteryTicket ticket = new LotteryTicket(ticketId, unluckyCode);

        // Check and print the luck of the ticket
        System.out.println(ticket.checkLuck());

        scanner.close();
    }
}
