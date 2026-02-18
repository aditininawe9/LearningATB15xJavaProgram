package ex17_Exceptions;

public class Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting");
        String input = args[0];// Index 0 out of bounds for length 0
        Integer a = Integer.parseInt(input); // Exception in thread "main" java.lang.NumberFormatException: For input string: "abd"
        int output = 100/a; //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("output");
        System.out.println("End");
    }
}
