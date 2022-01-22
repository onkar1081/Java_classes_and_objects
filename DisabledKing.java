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
		       if(a%2==0){
		           System.out.println(a);
		       }else{
		           System.out.println(a-1);
		       }
		    }
		}catch(Exception e){
		    System.out.println("Exception occured");
		}
	}
}
