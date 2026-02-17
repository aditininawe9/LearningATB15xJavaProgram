package ex18_SuperAbstraction;

public class BetterAbs {
    public static void main(String[] args) {
       Alto alto = new Alto();
       alto.startCar();
       alto.stopCar();

    }
}
class Alto extends Car1 {
    @Override
    void startCar() {
        System.out.println("Start Car");
    }

    @Override
    void stopCar() {
        System.out.println("Stop CAr");
    }
}

abstract class Car1 {
    abstract void startCar();
    abstract void stopCar();
}