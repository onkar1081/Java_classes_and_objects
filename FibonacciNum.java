import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=0;
    int b=1;
    int c=1;
    int number=s.nextInt();	
    for(int i=2;i<=number;i++){	    
    c=a+b;	     
    a=b;	    
    b=c;
    }
    System.out.println(c);
}
}
