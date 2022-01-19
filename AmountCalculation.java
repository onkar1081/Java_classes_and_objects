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
		       int princ=s.nextInt();
		       int amt=s.nextInt();
		       int arr[]=new int[3];
		       for(int j=0;j<3;j++){
		           arr[j]=s.nextInt();
		       }
		       String x=ob.chess(arr,princ,amt);
		       System.out.println(x);
	}
  }catch(Exception e ){
      System.out.println("Exception Occured");
  }
}
}
class Main2{
    public String chess(int []arr1 ,int princ,int amt){
       int x=princ-amt;
       int sum=0;
       String s2="";
       for(int y:arr1){
           sum=sum+y;
       }
       if(x>=sum){
           s2="YES";
       }else{
           s2="NO";
       }
       return s2;
    }
}
