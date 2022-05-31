import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    for(int i=1000;i<10000;i++){
	         int sr = (int)Math.sqrt(i);
	         String s1="";
	         char c=' ';
	         int temp=0;
	         int rem=0,rev=0,count=0;
             if(sr*sr==i){
                s1=Integer.toString(i);
                for(int j=0;j<s1.length();j++){
                    c=s1.charAt(j);
                    temp=Integer.parseInt(c+"");
                    if(temp%2==0){
                        count++;
                    }
                }
                if(count==s1.length()){
                    System.out.println(i);
                }
             }
	    }
	}
}
