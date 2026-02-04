package ex06_Inc_Dec;

public class incPost {
    public static void main(String[] args) {
        //Post inc = Print first than increase
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        //ERT (Expression and Result table)
        //LNo | a | b
        //6 | 10 | NA
        //7 | 10 | 11
        //8 | 10 |NA
        //9 | NA | 11

        int c = 10;
        System.out.println(c++ + ++c); // 10 + 12 = 22
        System.out.println(c);//12

        int d = 10;
        System.out.println(++d + ++d); //11 + 12 = 23
        System.out.println(d);//12
    }
}
