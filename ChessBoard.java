import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        Scanner s=new Scanner(System.in);
	            int a=s.nextInt();
	            int ans=(a*a)/2;
	            System.out.println(ans);
	    }catch(Exception e){
	        System.out.println("Exception occured");
	    }
	}
}
