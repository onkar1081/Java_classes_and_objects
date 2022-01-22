import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		        int examdur=s.nextInt();
		        int ep=s.nextInt();
		        int epdur=s.nextInt();
		        int time=ep*epdur;
		        if(time<examdur){
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
