package ex20_Enum;

public class EnumAdvance {
    public static void main(String[] args) {
        double earthGravity = Planet.MERCURY.surefaceGravity();
        System.out.println(earthGravity);
    }
}

enum Planet {
    MERCURY(3.303, 7.3838),
    VENUS(2.434e24, 6.0e74);

    private final double mass;
    private final double radius;

    Planet (double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {return  mass; }
    public double getRadius(){ return  radius; }

    public double surefaceGravity() {
        final double G = 6.6700 - 11;
        return G * mass / (radius * radius);
    }
}

