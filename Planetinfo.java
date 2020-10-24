package test2;
import java.util.Scanner;
class Planet{
    Scanner s=new Scanner(System.in);
    String name;
    double dist,grav;
    void getinfo()
    {
        System.out.println("Enter name of the planet");
        name=s.next();
        System.out.println("Enter distance of planet from sun");
        dist=s.nextDouble();
        System.out.println("Enter gravity relative to earth");
        grav=s.nextDouble();
    }
    void showinfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Distance from sun: "+dist);
        System.out.println("Gravity: "+grav);   
    }  
}
public class Test2 {
    public static void main(String[] args) {
       Planet ob1=new Planet();
       Planet ob2=new Planet();
        ob1.getinfo();
        ob2.getinfo();
        ob1.showinfo();
        ob2.showinfo();    
    } 
}
