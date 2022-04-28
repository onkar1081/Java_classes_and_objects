import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int c=0;
	    for(int i=2;i<n/2;i++){
	        if( i*i==n){
	            System.out.println("Yes");
	            c=1;
	    }
	    }
	    if(c==0){
	        System.out.println("No");
	    }
}
}
