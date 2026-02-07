package ex09_Functions;

public class simpleMethod {
    public static void main(String[] args) {
        no_return_function();
        int r = returnInt();
        System.out.println(r);
    }

    static void no_return_function() {
        System.out.println("Something with no return type");
    }

    static int returnInt() {
        return 10;
    }
}
