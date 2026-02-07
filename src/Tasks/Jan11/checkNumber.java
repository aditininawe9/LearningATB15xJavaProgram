package Tasks.Jan11;
import java.util.Scanner;

/*5) Positive, Negative or Zero

Description:
Write a Java program to check whether a given number is positive,
 negative, or zero using the ternary operator.
 */

public class checkNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number");

            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();

                String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
                System.out.println("Result " + result);
            } else {
                System.out.println("Please enter the valid number ");
                scanner.next();
                continue;
            }
        }
    }
}
