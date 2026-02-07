package Tasks.Jan11;
import java.util.Scanner;
/*
* 2) Even or Odd Number

Description:
Write a Java program to check whether a
* given number is even or odd using arithmetic operators.
* */
public class evenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        while (true) {
            if(scanner.hasNextInt()) {
                int n = scanner.nextInt();

                if(n % 2 == 0) {
                    System.out.println("Even");
                }else {
                    System.out.println("Odd");
                }
            }
            else {
                System.out.println("Please enter an integer ");
                scanner.next();
            }
        }
    }
}
