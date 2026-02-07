package Tasks.Jan11;
import java.util.Scanner;

/*7) Simple Calculator

Description:
Write a Java program to perform addition, subtraction, multiplication,
or division based on user choice using a switch statement.
 */

public class CalculaterBySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the operation number ");
            if(scanner.hasNextInt()) {
                int n = scanner.nextInt();
                System.out.println("Please enter numbers ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                switch (n) {
                    case 1:
                        int add = a + b;
                        System.out.println("Addition "+add);
                        break;
                    case 2:
                        int sub = a - b;
                        System.out.println("Sub "+sub);
                        break;
                    case 3:
                        int result = a * b;
                        System.out.println("Mul "+result);
                        break;
                    case 4:
                        int div = a / b;
                        System.out.println("div "+div);
                        break;
                    case 5:
                        int mod = a % b;
                        System.out.println("mod "+mod);
                        break;
                    default:
                        System.out.println("Please enter nu from 1 - 5 ");
                }
            }else {
                System.out.println("Enter the number");
                scanner.next();
                continue;
            }

        }
    }

}
