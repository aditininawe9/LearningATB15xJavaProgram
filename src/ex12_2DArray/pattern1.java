package ex12_2DArray;
import java.util.Scanner;
/*

*
* *
* * *
* * * *
* * * * *
 */
public class pattern1 {
    public static void main(String[] args) {
        System.out.println("Please enter the number ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }

    }
}
