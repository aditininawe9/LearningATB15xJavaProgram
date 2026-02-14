package ex14_OOPs;

public class Oops_2 {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby("Aditi");
        Baby b3 = new Baby("Aditi", "1L");
    }
}

class Baby {
    String name;
    Baby(){
        System.out.println("DC");
    }
    Baby(String name){
        System.out.println("PC - name");
    }
    Baby(String name, String money) {
        System.out.println("PC -name.age");
    }
}