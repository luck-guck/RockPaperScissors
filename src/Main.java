import java.util.Scanner ;

public class Main  {

    // Method to get a valid move from a player
    public static String getMove(Scanner sc, String playerName) {
        while (true) {
            System.out.print(playerName + ", enter your move (R, P, S): ");
            String move = sc.nextLine().trim();

            if (move.equalsIgnoreCase("R") ||
                    move.equalsIgnoreCase("P") ||
                    move.equalsIgnoreCase("S")) {
                return move.toUpperCase();
            }

            System.out.println("Invalid choice. Please enter R, P, or S.");
        }
    }

    // Method to determine the result phrase
    public static String resultPhrase(String a, String b) {
        if (a. equals (b)) {
            System.out.println("It's a tie!");
        }

        if (a. equals("R") && b.equals ("S"))
            System.out.println("Rock breaks Scissors — PlayerA wins!");

        // Otherwise PlayerB wins

        if (b.equals ("S") && a.equals ("P"))
            System.out.println("Scissors cuts Paper — PlayerB wins!");
        if (b.equals ("P") && a.equals ("R"))
            System.out.println(" Paper covers Rock — PlayerC wins!");
        if (b.equals ("R") && a.equals ("R"))
            System.out.println(" Rock vs Rock Its a tie !");

        System.out.println("Do you want to play again (Y/N");

        return a;
    }

}


