package Tasks;
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        // Guess a number from 1 to 100
        // n = 56
        // 90 , number < , 50, numner > , 55,  - 56 - times= 9

        Random random = new Random();
        int numberToGuess = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int guess;
        int attempts = 0;

        while (true) {
            if(!scanner.hasNextInt()){
                System.out.println("Please enter integer number");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Too low");
            } else if (guess > numberToGuess) {
                System.out.println("Too high");
            }else {
                System.out.println("Correct "+attempts);
                break;
            }
        }
    }
}
