package test1;
import java.util.Scanner;
class Student {
    Scanner s = new Scanner(System.in);
    String firstname,lastname,branch;
    int classyear;
    void getinfo() {
        System.out.println("Enter first name");
        firstname = s.next();
        System.out.println("Enter last name");
        lastname = s.next();
        System.out.println("Enter class year");
        classyear = s.nextInt();
        System.out.println("Enter branch");
        branch = s.next();
    }
    void showinfo()
    {   
        System.out.println("Firstname: "+firstname);
        System.out.println("Lastname: "+lastname);
        System.out.println("Classyear: "+classyear);
        System.out.println("Branch: "+branch);       
    }
}
public class Test1 {
    public static void main(String[] args) {
        Student ob1 = new Student();
        Student ob2 = new Student();
        ob1.getinfo();
        ob2.getinfo();
        ob1.showinfo();
        ob2.showinfo();
    }
}
