import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		double avg=0;
		String s5="";
		ArrayList <String>list=new ArrayList<String>();
		for(String s2:s1.split(",")){
		    list.add(s2);
		}
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		}
		for(int i=0;i<list.size();i++){
		   s5=list.get(i);
		   String s99="";
		   if(s5.contains("6")){
		       s99=s5.replaceAll("6","9");
		       int num=Integer.parseInt(s99);
		       System.out.println("s5 "+s99);
		       int reversed=0;
		       while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
               }
               String numstr=Integer.toString(reversed);
               System.out.println("i= "+i+"rev "+reversed);
               list.set(i,numstr);
            }
		}
		System.out.println("After all replace and reversed");
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		}
		int sum=0;
		int temp=0;
	    for(int i=0;i<list.size();i++){
	        String s10=list.get(i);
	         temp=Integer.parseInt(s10);
		   sum=sum+temp;
		}
		Double d2=Double.valueOf(sum);
		Double d3=Double.valueOf(list.size());
		avg=d2/d3;
		double roundOff = Math.round(avg*100)/100;
		System.out.println(roundOff);
	}
}
