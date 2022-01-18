import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
	    try{
	        int y;
	        Main2 ob=new Main2();
	       	 Scanner s=new Scanner(System.in);
		     int n=s.nextInt();
		     int arr[]=new int[n];
		     for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
		}
		    for(int j=0;j<n;j++){
		       y=ob.func(arr[j]);
		       System.out.println(y);
		    }
	 }catch(Exception e){
	     System.out.println("Exception occured");
	 }

	}
}

class Main2{
     int func(int x){
           int count1=0;
           String s1=Integer.toString(x);
           for(int a=0;a<s1.length();a++){
               if(s1.charAt(a)=='4'){
		           count1++;
		       }
           }
		       return count1;
    }
}
