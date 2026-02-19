package ex23_Generics;

public class GenericDemo {
    public static void main(String[] args) {
        temp_sum(3, 4);
        temp_sum("aditi", "soni");
    }

//    static void temp_sum(Integer a, Integer b) {
//        System.out.println(a);
//        System.out.println(b);
//    }
//    static void temp_sum(String a, String b) {
//        System.out.println(a);
//        System.out.println(b);
//    }
    static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
