// Access modifers
public class Second{
    public static void main(String args[]){
        bankAccount ba=new bankAccount();
        ba.username="chandan kumar";
        // ba.password="123456";
        System.out.println(ba.username);
        // error: password has private access in bankAccount ba.password="123456";
        // error :password has private access in bankAccount  System.out.println(ba.password);
       
        ba.setPassword("hello");
        


    }
}
class bankAccount{
    // default String username; we can make it public also
    public String username;
    private String password;
// we can never acess the password but can change the password by creating a function setPassword;
  public void setPassword(String pwd){
    password=pwd;
  }
}