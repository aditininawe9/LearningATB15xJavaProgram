package ex04_Operators;

public class operator {
    public static void main(String[] args) {
        // Assignment Operator
        int age = 10;
        // datatype variable_name (assignment Operator) literal

        // Arithematic Operator
        // + Addition
        // - Subtraction
        // * Multiplication
        // / Division
        // % Modulas

        int a = 20;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Unary Operator
        int a1 = +10;
        int b1 = 10;
        int c1 = -110;
        int result = a1+c1;
        System.out.println(result);

        // Modulas
        System.out.println(13%7);

        //Relational Operator
        // < Less than
        // <= Less than or equal to
        // > greater than
        // >= greater than or equal to
        // == Equals to(compare)
        // != Not equal

        int a2 = 10;
        int b2 = 30;
        System.out.println(a2 > b2);

        // Concat
        String firstName = "Aditi";
        String lastName = "Soni";
        int a3 = 10;
        int b3 = 5;
        System.out.println(firstName + lastName);
        System.out.println(firstName + lastName + a3 + b3);
        System.out.println(firstName + lastName + (a3 + b3));

        System.out.println(!(10 > 20));

        int salary = 12;
        boolean l = !(salary > 10 || salary < 5);
        System.out.println(l);

        String name = new String("aditi");
        System.out.println(name);

        String s1 = new String("aditi");
        int a4 =10;
        System.out.println(s1 instanceof Object);

        int a5 = 10;
        boolean b5 = (10 ==11);
        System.out.println(b5);

        char a6 = 'A'; //  ASCII - 65
        char b6 = 'B'; //  ASCII - 66
        System.out.println(a6);
        System.out.println(b6);
        System.out.println(a6+b6);
        System.out.println(a6-b6);

        System.out.println('A' == 65);

        short s = 10;
        char c = 'A'; //65
        System.out.println(c + s);
    }
}
