package ex13_Arrays;
import java.util.Scanner;

public class array_userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();

        int[] number_marks = new int[size];
        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the marks");
            number_marks[i] = scanner.nextInt();
        }
        System.out.println(" ==== ");
        for (int i = 0; i < number_marks.length; i++) {
            System.out.println(number_marks[i]);
        }
        System.out.println(" ==== ");
        // reverse
        for(int i = number_marks.length - 1; i >= 0; i--) {
            System.out.println(number_marks[i]);
        }
    }
}
