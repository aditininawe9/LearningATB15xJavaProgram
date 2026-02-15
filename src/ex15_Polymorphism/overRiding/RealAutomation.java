package ex15_Polymorphism.overRiding;

public class RealAutomation {
    public static void main(String[] args) {
        Chrome c1 = new Chrome();
        c1.OpenBrowser();

        Firefox f1 = new Firefox();
        f1.OpenBrowser();

        CommonToAll ca1 = new CommonToAll();
        ca1.OpenBrowser();

        CommonToAll ca2 = new Chrome();
        ca2.OpenBrowser();
    }
}

class CommonToAll {
    void OpenBrowser() {
        System.out.println("IE Browser");
    }
}

class Chrome extends CommonToAll {
    void OpenBrowser() {
        System.out.println("Chrome Browser");
    }
}

class Firefox extends CommonToAll {
    void OpenBrowser() {
        System.out.println("Firefox Browser");
    }
}
