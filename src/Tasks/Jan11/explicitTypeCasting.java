package Tasks.Jan11;
import java.util.Scanner;
/*
* 3) Explicit Type Casting

Description:
Write a Java program to convert a double value into an int
* using explicit type casting and print both values.
* */
public class explicitTypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the double value");

            if (scanner.hasNextDouble()) {
                double d = scanner.nextDouble();
                // int n = scanner.nextInt();
                int n = (int) d;
                System.out.println(d + " " + n);
            }else {
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }
            System.out.println("Continue y/n: ");
            if(scanner.next().equalsIgnoreCase("n"))
                break;
        }
    }
}
