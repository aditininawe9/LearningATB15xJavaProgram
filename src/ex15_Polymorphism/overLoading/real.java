package ex15_Polymorphism.overLoading;

public class real {
    public static void main(String[] args) {
        WebAutomation t1 = new WebAutomation();
        t1.openBrowser();
        t1.openBrowser("chrome");
    }
}

class WebAutomation {
    void openBrowser() {
        System.out.println("Default Browser");
    }

    void openBrowser(String browser) {
        System.out.println("Starting "+browser);
    }
}