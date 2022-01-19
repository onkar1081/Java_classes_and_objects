import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	     	Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		       Main2 ob=new Main2();
		       int arr[]=new int[3];
		       for(int j=0;j<3;j++){
		           arr[j]=s.nextInt();
		       }
		       int x=ob.chess(arr);
		       System.out.println(x);
	}
  }catch(Exception e ){
      System.out.println("Exception Occured");
  }
}
}
class Main2{
    public int chess(int []arr1 ){
        int a=2*(180+arr1[0]);
        int b=arr1[1]+arr1[2];
        int c=a-b;
        return c;
    }
}
