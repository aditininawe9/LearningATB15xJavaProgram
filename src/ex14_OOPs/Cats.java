package ex14_OOPs;

public class Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Simba");
    }

    static class Cat{
        String name;
        Cat() {
            System.out.println("DC");
        }

        Cat(String nameGiven) {
            this.name = nameGiven;
            System.out.println(name);
        }

        void running() {
            int loc_var = 10;
            System.out.println("run "+this.name);
        }
    }
}
