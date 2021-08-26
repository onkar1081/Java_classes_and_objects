import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
       int n1=0,n2=1,n3,i,number;    
     System.out.println("Enter the number of elements:");   
     Scanner s=new Scanner(System.in);
     number=s.nextInt();    
     System.out.print(n1+" "+n2+" ");  
     for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;    
      System.out.print(n3+" ");   
      n1=n2;    
      n2=n3;    
     }   
     }
    }  
