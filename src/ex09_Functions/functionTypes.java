package ex09_Functions;

public class functionTypes {
    public static void main(String[] args) {
        // User Defined Functions
        // 1. Without Parameters and return type
        // 2. Without Parameters but with return type
        // 3. With Parameters and without return type
        // 4. With Parameters and with return type

        // 1. Without Arguments/Parameters and return type
        wop_wor_greet();

        // 2. Without Parameters but with return type
        String msg = wop_wor_greet_2();

        // 3. With Parameters and without return type
        greet_with_Details("Aditi", 65, 100);

        // 4. With Parameters and with return type
        int sum = sum_of_two_numbers(3, 4);
    }

    public static String wop_wor_greet_2() {
        return "Aditi";
    }

    private static void greet_with_Details(String name, int i, int i1) {
    }

    public static int sum_of_two_numbers(int i, int i1) {
        return i+ i1;
    }

    public static void wop_wor_greet() {
    }
}
