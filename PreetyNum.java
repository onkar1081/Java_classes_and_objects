import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int j=0;j<n;j++){
		    int count=0;
		int a=s.nextInt();
		int b=s.nextInt();
		String s1="";
		for(int i=a;i<=b;i++){
		   s1=Integer.toString(i);
		   int size=s1.length()-1;
		   if(s1.charAt(size)=='2'||s1.charAt(size)=='3'||s1.charAt(size)=='9'){
		       count++;
		   }
		}
		System.out.println(count);
	}
	}
}
