package ex17_Exceptions;

public class NullPointerAndPipe {
    public static void main(String[] args) {
        String s1 =null;
        try {
            s1.trim();
            int a = 10/0;
        }catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null Error ");
        }finally {
            System.out.println("end");

        }
    }
}
