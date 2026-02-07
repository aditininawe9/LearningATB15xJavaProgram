package Tasks.Jan11;
import java.util.Scanner;

/* 6) Day of the Week

Description:
Write a Java program to print the
name of the day based on a number (1–7) using a switch statement.
 */

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day number: ");
        if(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            switch(n) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursady");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Satday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter valid day number");
            }

        }else {
            System.out.println("Please enter the day number ");
        }
    }
}
