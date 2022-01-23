import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		       int a=s.nextInt();
		       int b=s.nextInt();
		       if((a+b)%2==0){
		           System.out.println("Yes");
		       }else{
		           System.out.println("No");
		       }
		    }
		}catch(Exception e){
		    System.out.println("Exception occured");
		}
	}
}
