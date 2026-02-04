package ex06_Inc_Dec;

public class tasks {
    public static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++; // 10 + 11 + 12 =33
        System.out.println(a); // 33



        int a1 = 3;

        int b = a1++ * ++a1; // 3 * 5

        System.out.println(b);


        int a2 = 5;

        System.out.println(a2++ + a2--); // 5 + 6 = 11
    }
}
