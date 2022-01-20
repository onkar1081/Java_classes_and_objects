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
		       int x=s.nextInt();
		       int y=s.nextInt();
		       int z=s.nextInt();
		       int s1=ob.range(x,y,z);
		       System.out.println(s1);
	}
  }catch(Exception e ){
      System.out.println("Exception Occured");
  }
}
}
class Main2{
    public int range(int a,int b,int c){
       int ans=0;
       a=a-1;
       ans=(b-a)*c;
       return ans;
    }
}
