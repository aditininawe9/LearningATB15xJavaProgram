package ex06_Inc_Dec;

public class incPre {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++a = a + 1
        //Expression and result table
        //Line No | a | Result b
        //5 | 10 | NA
        //6 | 11 | 11
        //7| 11 -> a
        //8| 11 -> b
    }
}
