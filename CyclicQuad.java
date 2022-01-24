import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        for(int i=0;i<n;i++){
	            int a=s.nextInt();
	            int b=s.nextInt();
	            int c=s.nextInt();
	            int d=s.nextInt();
	            if(a+c==180 && b+d==180){
	                System.out.println("YES");
	            }else{
	                System.out.println("NO");
	            }
	        }
	    }catch(Exception e){
	        System.out.println("Exception occured");
	    }
	}
}
===
