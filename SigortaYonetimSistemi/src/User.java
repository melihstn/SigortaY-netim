import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    String isim;
    String soyisim;
    String email;
    String sifre;
    String meslek;
    int yas;
    private LocalDate lastLoginDate;
    ArrayList<Address>addresslist = new ArrayList<Address>();
    private List<Insurance> insurances = new ArrayList<>();

    public User(String isim, String soyisim, String email, String sifre, String meslek, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.meslek = meslek;
        this.yas = yas;
        this.lastLoginDate = LocalDate.now();

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public ArrayList<Address> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(ArrayList<Address> addresslist) {
        this.addresslist = addresslist;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }
}
