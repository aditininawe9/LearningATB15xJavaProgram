package ex12_StringBuffer;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String user_input = scanner.next();

        String rev_String = "";
        for (int i = user_input.length() - 1; i >= 0; i--){
            rev_String = rev_String + user_input.charAt(i);
        }
        if (rev_String.equalsIgnoreCase(user_input)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
