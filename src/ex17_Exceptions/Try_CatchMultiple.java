package ex17_Exceptions;

public class Try_CatchMultiple {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
