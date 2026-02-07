package Tasks.Jan11;

import java.util.Scanner;

/* 1) Arithmetic Operations on Two Numbers

Description:
Write a Java program that takes two integer numbers and
prints their sum, difference, multiplication, division, and remainder.*/

public class arithematicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 2 integers ");
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                int sum = a + b;
                System.out.println("Sum "+sum);

                int diff = a - b;
                System.out.println("Diffrence "+diff);

                int mul = a*b;
                System.out.println("Multiplication "+mul);

                int div = a / b;
                System.out.println("Division "+div);

                int remain = a % b;
                System.out.println("Remainder "+remain);
            }else {
                System.out.println("Please enter the valid integer");
                scanner.next();;
            }
        }
    }
}
