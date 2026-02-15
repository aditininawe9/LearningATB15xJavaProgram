package ex15_Polymorphism.overRiding;

public class methodOverriding {
    public static void main(String[] args) {
        Aditi a1 = new Aditi();
        a1.home();
        Father a2 = new Aditi();
        a2.home();
        Father a3 = new Father();
        a3.home();
    }
}

class Father {
    void home() {
        System.out.println("2bhk");
    }
}

class Aditi extends Father {
    @Override
    void home() {
        System.out.println("3bhk");
    }
}