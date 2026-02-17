package ex19_Interfaces;

public class Interface_P1 {
    public static void main(String[] args) {
        Son son = new Son();
        son.money();
    }
}

interface T1 {
    void icm1();
    void money();
}

interface  T2{
    void money();
}

abstract class Mother {
    abstract void money() ;
}
class Son extends Mother implements T1, T2{

    @Override
    public void icm1() {

    }

    @Override
    public void money() {
        System.out.println("Son's money");
    }
}