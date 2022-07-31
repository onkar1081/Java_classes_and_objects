import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        int temp=0;
        boolean ans=false;
        String s1="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            temp=s.charAt(i);
            if(temp>=97 && temp<=122 || temp>=48 && temp<=57){
               s1=s1+(char)temp; 
            }
        }
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)){
            ans=true;
        }
        System.out.println(s1);
        System.out.println(s2);
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		String samp="Marge, let's \"[went].\" I await {news} telegram.";
		System.out.println(ob.isPalindrome(samp));
	}
}
