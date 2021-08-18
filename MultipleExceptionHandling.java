package multiple.exception.handling;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultipleExceptionHandling {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            int a=s.nextInt();
            int b=s.nextInt();
            int ans=a/b;
            System.out.println(ans);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}




