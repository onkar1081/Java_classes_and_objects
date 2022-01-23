import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
	    try{
	        Scanner s=new Scanner(System.in);
	            int n=s.nextInt();
	            for(int i=0;i<n;i++){
	                int x=s.nextInt();
	                x++;
	                Main2 ob=new Main2();
	                while (ob.nextPalindrome(x)==0) {
                       x++;
	            }
             System.out.println(x);
	            
	    }
	    }catch(Exception e){
	        System.out.println("Exception "+e);
	    }
	}
}
class Main2{
    public int nextPalindrome(int x){
        int rem=0,sum=0;
	    int temp=x;
	       while(x!=0){
	          rem=x%10;
	          sum=sum*10+rem;
	          x=x/10;
	   }
	   if(temp==sum){
	       return 1;
	   }else{
	       return 0;
	   }
    }
}
