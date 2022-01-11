import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1=s.next();
		System.out.println("Enter String 2");
		String s2=s.next();
		int count=0;
		 for(int i=0;i<s1.length();i++){
		     if(s1.contains(s2.charAt(i)+"")){
		        count++;
		  }
		 }
		  if(count==s1.length()){
		      System.out.println("Anagram");
		  }else{
		      System.out.println("Not Anangram");
		  }
	}
}

