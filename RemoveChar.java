package removechar;
import java.util.Scanner;
public class RemoveChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1 = "queen";
        System.out.println("Enter string");
        String s2=s.nextLine();
        StringBuffer sb=new StringBuffer(s2);  
        char arr[] = s1.toCharArray();
        for (char c : arr) {
            int i=sb.indexOf(""+c);
            if(i!=-1)
            {
                sb=sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }   
}
