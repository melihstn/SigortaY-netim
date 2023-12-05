import java.util.Scanner;

public class Authentication {
    private User user;
    public enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    public Authentication(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public AuthenticationStatus login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz : ");
        String mail = scan.next();
        System.out.println("Şifrenizi giriniz : ");
        String sifre = scan.next();

        if (user.getEmail().equals(mail) && user.getSifre().equals(sifre)){
            return AuthenticationStatus.SUCCESS;
        }
        return AuthenticationStatus.FAIL;

    }
}
