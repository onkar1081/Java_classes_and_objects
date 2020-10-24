package trycatch;    
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            int c = a / b;
            System.out.println("Division is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Hello");
    }
}
