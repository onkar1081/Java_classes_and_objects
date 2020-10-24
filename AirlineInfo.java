package test4;
import java.util.Scanner;
    class Ticket{
        Scanner s=new Scanner(System.in);
        int deptime,arrtime,flightnum;
        String seat;
        void getinfo()
    {
        System.out.println("Enter Departure time");
        deptime=s.nextInt();
        System.out.println("Enter Arrival Time");
        arrtime=s.nextInt();
        System.out.println("Enter flight number");
        flightnum=s.nextInt();
        System.out.println("Enter seat assignment");
        seat=s.next();
    }
    void showinfo()
    {
        System.out.println("Departure Time: "+deptime);
        System.out.println("Arrival Time: "+arrtime);
        System.out.println("Flight Number: "+flightnum);   
        System.out.println("Seat Assignment: "+seat);  
    }  
  }
public class Test4{
    public static void main(String[] args) {
       Ticket ob1=new Ticket();
       Ticket ob2=new Ticket();
        ob1.getinfo();
        ob2.getinfo();
        ob1.showinfo();
        ob2.showinfo(); 
    }
}
