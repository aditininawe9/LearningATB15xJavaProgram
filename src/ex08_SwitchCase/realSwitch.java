package ex08_SwitchCase;
import java.util.Scanner;

public class realSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Browser is starting");
                System.out.println("...");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                break;
            case "edge":
                System.out.println("Starting edge");
                break;
            default:
                System.out.println("I've no idea");
                break;
        }
    }
}
