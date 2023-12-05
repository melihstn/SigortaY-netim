
public class Main {
    public static void main(String[] args) throws InvalidAuthenticationException{

        AccountManager accountManager = new AccountManager();

        User user1 = new User("melih","üstün","melih.stn98@gmail.com","mm123","mühendis",25);

        user1.getInsurances().add(new HealthInsurance(10000));

        AddressManager addressManager = new AddressManager(user1);
        addressManager.add(new HomeAddress("bağcılar","istanbul","Türkiye"));

       

       accountManager.login("melih.stn98@gmail.com","mm123");





    }

    }
class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException(String message) {
        super(message);
    }
}

