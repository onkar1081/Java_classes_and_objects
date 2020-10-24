package universalcatch; 

import java.util.Scanner;

public class UniversalCatch {     
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
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello");
    }   
}
