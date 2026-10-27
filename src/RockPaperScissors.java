import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";

        // 1. Get a valid move choice from playerA
        while (true) {
            System.out.print("Player A, enter your move (R, P, S): ");
            playerAMove = scanner.nextLine().trim();
            if (playerAMove.equalsIgnoreCase("R") ||
                    playerAMove.equalsIgnoreCase("P") ||
                    playerAMove.equalsIgnoreCase("S")) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // 2. Get a valid move choice from playerB
        while (true) {
            System.out.print("Player B, enter your move (R, P, S): ");
            playerBMove = scanner.nextLine().trim();
            if (playerBMove.equalsIgnoreCase("R") ||
                    playerBMove.equalsIgnoreCase("P") ||
                    playerBMove.equalsIgnoreCase("S")) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // Normalize inputs to uppercase for easy comparison
        playerAMove = playerAMove.toUpperCase();
        playerBMove = playerBMove.toUpperCase();

        System.out.println(); // Blank line for spacing

        // 3. Display the results and determine the winner
        if (playerAMove.equals(playerBMove)) {
            String choiceWord = "";
            if (playerAMove.equals("R")) choiceWord = "Rock";
            else if (playerAMove.equals("P")) choiceWord = "Paper";
            else choiceWord = "Scissors";

            System.out.println(choiceWord + " vs " + choiceWord + " it's a Tie!");
        } else if (playerAMove.equals("R")) {
            if (playerBMove.equals("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player A wins!");
            } else {
                System.out.println("Paper covers Rock");
                System.out.println("Player B wins!");
            }
        } else if (playerAMove.equals("P")) {
            if (playerBMove.equals("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player A wins!");
            } else {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player B wins!");
            }
        } else if (playerAMove.equals("S")) {
            if (playerBMove.equals("P")) {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player A wins!");
            } else {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player B wins!");
            }
        }

        scanner.close();
    }
}