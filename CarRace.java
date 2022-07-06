import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n1=2,n2=12,x=15,temp2=1;
	    int temp1=temp2+x;
	    int sec=0;
	    if(n1>n2){
	        System.out.println("-1");
	    }else{
	    while(temp2<=temp1){
	        temp1=temp1+n1;
	        temp2=temp2+n2;
	        sec++;
	    }
	    System.out.println(sec);
	    }
	}
}
