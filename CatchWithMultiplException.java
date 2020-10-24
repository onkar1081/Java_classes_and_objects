package catchwithmultiplexception;
import java.util.Scanner;
public class CatchWithMultiplException {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            arr[b]=100;
            int c = a / b;
            System.out.println("Division is " + c);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            if(e instanceof ArithmeticException)
            {
                System.out.println("Cannot div by zero");
            }
            if(e instanceof ArrayIndexOutOfBoundsException)
            {
                System.out.println("Array index not valid");
            }
        }
        System.out.println("Hello");
    }   
}
