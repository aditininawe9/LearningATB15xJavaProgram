package ex20_Enum;

public class EnumUse {
    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());
    }
}
