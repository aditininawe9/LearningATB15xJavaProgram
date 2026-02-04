package ex07_ifElse;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.next();

        if (age >30) {
            System.out.println("age > 30");
        }else if(age < 30) {
            System.out.println("age <30");
        }else {
            System.out.println("age == 30");
        }
        scanner.close();
    }
}
