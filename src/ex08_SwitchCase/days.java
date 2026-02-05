package ex08_SwitchCase;
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 in a program");
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                default:
                    System.out.println("Please enter valid number from 1-3");
                    break;
            }
        }else {
            System.out.println("Invalid int is entered");
        }
    }
}
