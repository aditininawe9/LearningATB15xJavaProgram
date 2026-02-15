package ex15_Polymorphism.overLoading;

public class methodOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(4,5);
        int r2 = m1.add(1,2,3);
        double r3 = m1.add(2.5, 2.5);
        String r4 = m1.add(" Aditi "," Soni ");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}