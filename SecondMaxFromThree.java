import java.util.*;
import java.io.*;
public class Main
{
    static int secondLargest(int num, int num2,int num3){
        int max=0;
        if(num>num2 && num>num3){
		     max=num;
		 }else if(num2>num && num2>num3){
		    max=num2;
		 }else if(num3>num && num3>num2){
		    max=num3;
		 }
		 return max;
    }
	public static void main(String[] args) throws Exception{
		try{
		    Scanner s=new Scanner(System.in);
		    int t=s.nextInt();
		    for(int i=0;i<t;i++){
		        int num=s.nextInt();
		        int num2=s.nextInt();
		        int num3=s.nextInt();
		        int maximum=secondLargest(num,num2,num3);
		        if(maximum==num){
		            num=0;
		        }else if(maximum==num2){
		            num2=0;
		        }else if(maximum==num3){
		            num3=0;
		        }
		        int secondMax=secondLargest(num,num2,num3);
		        System.out.println(secondMax);
		}
		}catch(Exception e){
		    System.out.println("Exception "+e);
		}
	}
}
