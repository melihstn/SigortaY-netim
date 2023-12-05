public class AddressManager {

    private User user;

    public AddressManager(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public  void add(Address address){

        this.user.getAddresslist().add(address);


    }
    public void delete(Address address){
        this.user.getAddresslist().remove(address);


    }
}
