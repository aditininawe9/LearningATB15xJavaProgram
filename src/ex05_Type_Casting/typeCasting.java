package ex05_Type_Casting;

public class typeCasting {
    public static void main(String[] args) {
        // Widening
        byte b = 10;
        int a = b;
        int a1 = (int) b;
        System.out.println(a1);

        //Narrowing
        int val =300;
        byte b1 = (byte)val;
        System.out.println(b1);

        long phone = 987654321l;
        short s1 = (short) phone;
        System.out.println(s1);

        int course = 100;
        float NSRT_GST = 18.45f;
////        int total = course+ NSRT_GST; // Narrowing - Implicit.
//        int total = course+ (int)NSRT_GST; // Narrowing - Explicit.
//        System.out.println(total);

        float total2 = course+ NSRT_GST; // widening  - Implicit
        float total3 = (float) course+ NSRT_GST; // widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);

        char ch = 'A';
        int ascii = ch; // Widening
        System.out.println(ascii);
        int num = 66; // Narrow
        char letter = (char) num;
        System.out.println(letter);
    }
}
