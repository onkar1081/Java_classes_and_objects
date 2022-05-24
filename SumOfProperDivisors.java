import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=36,sum=0;
	    for(int i=1;i<=(36/2);i++){
	        if(n%i==0){
	            sum=sum+i;
	        }
	    }
	    System.out.println(sum);
	}
}
