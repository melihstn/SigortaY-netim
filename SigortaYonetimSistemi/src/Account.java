public abstract class Account {
   private User user;

   public Account(User user) {
      this.user = user;
   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public final void showUserInfo(){
      System.out.println("----Müşteri Bilgişeri----");
      System.out.println("Müşteri ismi : " + this.user.getIsim());
      System.out.println("Müşteri Soyadı : " + this.user.getSoyisim());
      System.out.print("Müşteri emaili : " + this.user.getEmail());
      System.out.println("Müşteri şifresi : " + this.user.getSifre());
      System.out.println("müşteri mesleği : " + this.user.getMeslek());
      System.out.println("Müşteri yaşı : " + this.user.getYas());
      System.out.println();
      System.out.println("--- Adres Listesi---");

      for (int i = 0; i<user.getAddresslist().size(); i++){
         System.out.println((i+1) + ". adres : ");
         System.out.println(user.getAddresslist().get(i).getCountry()+user.getAddresslist().get(i).getCity()+user.getAddresslist().get(i).getTown());
      }
      System.out.println("---------------------------------");

      System.out.println("Sigorta listesi");

      for (Insurance s: user.getInsurances()){
         System.out.println("Sigorta tipi : " + s.getClass().getName());
         System.out.println("Sigorta bedeli : " + s.calculate());
         System.out.println("başlama tarihi : " + s.startDate);
         System.out.println("Bitiş tarihi : " + s.finishDate);
      }



   }


}
