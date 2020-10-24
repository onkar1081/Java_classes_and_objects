package test3;
import java.util.Scanner;
class Customer{
    Scanner s=new Scanner(System.in);
    String firstname,lastname;
    double balance;
    void getinfo()
    {
        System.out.println("Enter firstname of customer");
        firstname=s.next();
        System.out.println("Enter lastname of customer");
        lastname=s.next();        
    }
}
class Account extends Customer
{
    void getdata()
    {
        System.out.println("Enter account balance");
        balance=s.nextDouble();
    }
    void showinfo()
    {
        System.out.println("Firstname: "+firstname);
        System.out.println("Lastname: "+lastname);
        System.out.println("Account balance: "+balance);     
    }   
}
public class Test3 {
    public static void main(String[] args) {
        Account ob1=new Account();
        Account ob2=new Account();
        ob1.getinfo();
        ob1.getdata();
        ob2.getinfo();
        ob2.getdata();
        ob1.showinfo();
        ob2.showinfo();      
    }
}
