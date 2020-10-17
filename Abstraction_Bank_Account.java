package abstraction_bank_account;
abstract class Account{
    abstract void interest();
}
class Saving extends Account{
    @Override
    void interest()
    {
        System.out.println("Interest calculated using rules of Saving Account");
    }
}
class Current extends Account{
    @Override
    void interest() {
        System.out.println("Interest calculated using rules of Current Account");
    }  
}
public class Abstraction_Bank_Account {
    public static void main(String[] args) {
        Saving ob1=new Saving();
        Current ob2=new Current();
        show(ob1);
        show(ob2);
    }  
    static void show(Account r)
    {
        r.interest();
    }
}
