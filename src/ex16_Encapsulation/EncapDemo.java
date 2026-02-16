package ex16_Encapsulation;

public class EncapDemo {
    public static void main(String[] args) {
        Login login = new Login("aditi", "454");
        System.out.println(login.username);
        System.out.println(login.password);

        goodLogin gLogin = new goodLogin("adi", "399");
        System.out.println(gLogin.getUsername());

    }
}

class Login {
    public String username;
    public String password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
}

class goodLogin {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    goodLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}