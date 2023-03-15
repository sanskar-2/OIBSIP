import java.util.Scanner;
import java.util.Random;

public class guessinggame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        while (guess != number) {
        System.out.print("Enter your guess: ");
            guess = input.nextInt();
            count++;
            
         if (guess < number) {
            System.out.println("Smaller number Try again.");
            } else if (guess > number) {
            System.out.println("Greater number Try again.");
            } else {
            System.out.println("Congratulations! You guessed the number in " + count + " tries.");
            }
        }
        
        input.close();
    }
}
    

