import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class AccountManager {

    private Set<Account> dataList = new TreeSet<>(new Comparator<Account>() {
        @Override
        public int compare(Account o1, Account o2) {
            return o1.getUser().getIsim().compareTo(o2.getUser().getIsim());
        }
    });



    public AccountManager() {
        this.dataList = dataList;
    }

    public Set<Account> getDataList() {
        return dataList;
    }

    public void setDataList(Set<Account> dataList) {
        this.dataList = dataList;
    }

    public void login(String email, String sifre) throws InvalidAuthenticationException {

        for (Account account : dataList){
            Authentication authentication = new Authentication(account.getUser());

            if (account.getUser().getSifre().equals(sifre) && account.getUser().getEmail().equals(email)){
                if (authentication.login() == Authentication.AuthenticationStatus.FAIL){
                    throw new InvalidAuthenticationException("Hata kullanıcı adı veya şifre hatalı !");
                }else {
                    account.showUserInfo();
                }

            }
        }

    }
}
