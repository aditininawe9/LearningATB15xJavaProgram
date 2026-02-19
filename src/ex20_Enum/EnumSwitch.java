package ex20_Enum;

public class EnumSwitch {
    public static void main(String[] args) {
        Day today = Day.THURSDAY;

        switch (today) {
            case MONDAY -> System.out.println("Mondar");
            case THURSDAY -> System.out.println("Thursday");
        }
    }
}
