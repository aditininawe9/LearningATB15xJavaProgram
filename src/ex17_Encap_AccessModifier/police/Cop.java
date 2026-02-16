package ex17_Encap_AccessModifier.police;

public class Cop {
    private int gun;
    private String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }

    protected  void canIShoot() {
        System.out.println("Yes");
    }

    void defaultF1() {
        System.out.println("Hi cop");
    }
}
