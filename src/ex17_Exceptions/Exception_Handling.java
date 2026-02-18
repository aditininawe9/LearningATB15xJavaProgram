package ex17_Exceptions;

public class Exception_Handling {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        }catch (Exception e) {
            System.out.println("Div by 0");
        }
        System.out.println(a);
    }
}
