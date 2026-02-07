package Tasks.Jan11;
import java.util.Scanner;
/*
* 4) Maximum of Two Numbers

Description:
Write a Java program to find the
* maximum of two numbers using the ternary operator.*/

public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two numbers ");

            if(scanner.hasNextInt()) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                int result = (a > b)? a : b;
                System.out.println(result);
            }else {
                System.out.println("Enter valid input ");
                scanner.next();
                continue;
            }
            System.out.println("continue y/n? ");
            if (scanner.next().equalsIgnoreCase("n")){
                break;
            }

        }
    }
}
