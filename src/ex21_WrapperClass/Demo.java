package ex21_WrapperClass;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        // Autoboxing
        Integer obj = a;
        //Integer obj = Integer.valueOf(a)
        System.out.println(obj);

        //Unboxing
        Integer obj2 = 10;
        int b = obj2;
        //int b = obj.intValue();
        System.out.println("b =>" +b);

        int num = Integer.parseInt("123");
        System.out.println("num => "+num);

        String s = Integer.toString(100);
        System.out.println("s => "+s);

        Integer b1 = 10;
        b1 = b1 + 10;
        System.out.println("b1 => "+b1);

    }
}
