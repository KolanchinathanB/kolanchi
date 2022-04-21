package OOPs;


class Account{
    private String Name="kolanchi";
    private String AccNo="12345678";
    public String bankName="";
    public String getAccoutPassword() {
        return accoutPassword;
    }

    public void setAccoutPassword(String accoutPassword) {
        this.accoutPassword = accoutPassword;
    }

    private  String accoutPassword="Kolanchi42@";
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance=1200.50;
    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }




}

public class Person extends Account {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println("Account number is "+p.getAccNo());
        System.out.println("Account balance is"+ p.getBalance());
        //change balance
         p.setBalance(1500);
         //after changing balance
        System.out.println("After changing account balance us "+p.getBalance());
        System.out.println("Password "+ p.getAccoutPassword());
    }
}
