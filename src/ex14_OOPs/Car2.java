package ex14_OOPs;

public class Car2 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);
        Car p = new Car("tesla");
        System.out.println(p.name);
        Car e = new Car("xuv", "jjj");
        System.out.println(e.name+ " "+e.model);

        LoginPage l = new LoginPage("aditi@gmail.com", "232", "Yes");
        System.out.println(l.email+ " "+ l.password+ " "+l.submitButton);
    }
}

class Car {
    String name;
    int year;
    String model;

    Car() {
        name = "Unknown car";
        year = 1991;
        model = "xyz";
    }

    Car(String nameGiven) {
        this.name = nameGiven;
    }

    Car(String nameGiven, String model) {
        this.name = nameGiven;
        this.model = model;
    }
}