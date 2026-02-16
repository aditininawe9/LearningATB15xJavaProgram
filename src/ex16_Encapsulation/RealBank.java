package ex16_Encapsulation;

public class RealBank {
    public static void main(String[] args) {
        HDFCBank amit = new HDFCBank("Amit", 454545454);
        long bal = amit.getBal();;
        System.out.println(bal);
        amit.setBal(200, true);
        System.out.println(amit.getBal());
    }
}

class HDFCBank {
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier){
            this.bal = bal;
        }
        else {
            System.out.println("Not allowed");
        }
    }

    public HDFCBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
}