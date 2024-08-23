import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            System.out.println("Choose (rock, paper, scissors) or type 'exit' to quit:");
            String playerChoice = scanner.nextLine().toLowerCase();
            
            if (playerChoice.equals("exit")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
            
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }
            
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);
            
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
