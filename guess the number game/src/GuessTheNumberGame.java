
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Random number is: "+ randomNumber);

        while(true){
            System.out.println("Enter your guess between 1-100:");

            int playerGuess = scanner.nextInt();
    
            if(playerGuess > randomNumber){
                System.out.println("Nope! the number is lower.");
            }
            else if (playerGuess == randomNumber) {
                System.err.println("Correct! You won.");
                break;
            }
            else{
                System.err.println("Nope! the number is higher");
            }
        }
    }
}
