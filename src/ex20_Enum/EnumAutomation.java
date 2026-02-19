package ex20_Enum;

public class EnumAutomation {
    public static void main(String[] args) {
        System.out.println(HEX_CODES.RED.getHexcode());
    }
}

enum HEX_CODES {
    RED("#FF000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    HEX_CODES(String hexcode) {
        this.hexcode = hexcode;
    }

    String getHexcode() {
        return this.hexcode;
    }
}
