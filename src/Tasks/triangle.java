package Tasks;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one side");
        a = scanner.nextInt();
        System.out.println("Enter 2nd side");
        b = scanner.nextInt();
        System.out.println("Enter 3rd side");
        c = scanner.nextInt();
        if(a == b && a == c && b == c && c == a) {
            System.out.println("Equilateral trianlge");
        }
        else if((a == b || b == c || c == a)) {
            System.out.println("Isosceles trianlge");
        }else {
            System.out.println("Scalene trianlge");
        }
        scanner.close();
    }
}
