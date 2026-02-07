package ex09_Functions;

import java.util.Scanner;

public class functionArthematic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter num1");
        int b = readInt(scanner, "Enter num2");
        int c = readInt(scanner, "Enter num1");

        int result_sum = sum(a,b);

    }

    public static int readInt(Scanner scanner, String prompt){
        System.out.println(prompt);
        if(scanner.hasNext()){
            return scanner.nextInt();
        }else {
            System.out.println("Enter int only");
            System.exit(0);
            return 0;
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
