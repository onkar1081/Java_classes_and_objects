package trywithmultiplecatch;
import java.util.Scanner;
public class TryWithMultipleCatch {
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
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Array Index is not valid");
        }
        System.out.println("Hello");
    }
}
