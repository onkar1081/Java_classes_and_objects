import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  String s1="1234";
	  int x=0;
	  int sum=0;
	  boolean ans=false;
	  if(!s1.contains(" ")){
	      if(s1.length()==4 || s1.length()==6){
	          String []arr1=s1.split("");
	          for(int i=0;i<s1.length();i++){
	              char c=s1.charAt(i);
	              x=c;
	              if(x>=48 && x<=57){
	                  sum++;
	              }
	          }
	          if(sum==s1.length()){
	              ans=true;
	          }

	      }
	  }
	  System.out.println(ans);
	}
}
