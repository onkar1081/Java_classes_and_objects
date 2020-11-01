package splitstring;
import java.util.Scanner;
public class SplitString {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string");
        String s1=s.next();
        System.out.println("Enter n");
        int n=s.nextInt();
        int len=s1.length();
        int x =len/n;
        System.out.println("The string divided into "+n+" parts and they are");
        for (int i = 0; i < s1.length(); i=i+x) {
            System.out.print(s1.substring(i, i+x));
            System.out.println("");
        }
    }   
}
