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
		       int c=s.nextInt();
		       int mult=a*b;
		       int add=a+c;
		       if(mult>add){
		           System.out.println(add);
		       }else{
		           System.out.println(mult);
		       }
		    }
		}catch(Exception e){
		    System.out.println("Exception occured");
		}
	}
}
