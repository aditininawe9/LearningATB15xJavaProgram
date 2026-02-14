package ex14_OOPs.Inheritnace.Single;

public class SI {
    public static void main(String[] args) {
        Son jay = new Son();
        System.out.println(jay.gold);
        jay.bhk2();
        jay.bhk3();

        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();
    }
}
