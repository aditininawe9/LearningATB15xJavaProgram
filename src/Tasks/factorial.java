package Tasks;
import java.util.Scanner;

//!5 = 5 * 4 * 3 * 2 * 1

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive int number");
        int fact = 1;
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println(n);
            for (int i = 1; i <=n ;i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
        else {
            System.out.println("PLease emter valid integer");
        }
    }
}
