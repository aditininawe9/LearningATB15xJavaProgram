package Tasks.Jan11;
import java.util.Scanner;

/* 9) Print Numbers Using do-while

Description:
Write a Java program to print numbers from 1 to 10
using a do-while loop.
 */

public class doWhileNumbers {
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while (n <= 10);
    }
}
