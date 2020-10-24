package userdefinedexception;
import java.util.Scanner;
public class UserDefinedException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        System.out.println("Enter a number divisible by 5.....");
        x=s.nextInt();
        try {
            if(x%5!=0)
            {
               Myexception ex=new Myexception();
               throw ex;
            }
            System.out.println("Correct number");
        } catch (Myexception e) {
            System.out.println(e);
            System.out.println(e.toString());
        }
    } 
}
class Myexception extends Exception{
    @Override
    public String toString() {
        return "Number is not divisible by 5";
    }    
}
        
