import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception{
	    try{
	       	 Scanner s=new Scanner(System.in);
		     int n=s.nextInt();
		     int arr1[]=new int[n];
		     for(int i=0;i<n;i++){
		     int arr[]=new int[4];
		     int a,b,c,d;
		     a=s.nextInt();
		     b=s.nextInt();
		     c=s.nextInt();
		     d=s.nextInt();
		     int x=c/a;
		     int y=d/b;
		     int sum1=x+y;
		     arr1[i]=sum1;
		}
	    for(int i=0;i<n;i++){
	        System.out.println(arr1[i]);
	    } 
	 }catch(Exception e){
	     System.out.println("Exception occured");
	 }

	}
}
