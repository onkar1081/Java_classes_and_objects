import java.util.*;
class Solution {
    public String firstPalindrome(String[] words) {
        String s2="",ans="";
        for(String s1:words){
            s2="";
            for(int i=s1.length()-1;i>=0;i--){
                s2=s2+s1.charAt(i);
            }
            if(s1.equals(s2)){
                ans=s1;
                break;
            }
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		String arr[]={"abc","car","ada","racecar","cool"};
		System.out.println(ob.firstPalindrome(arr));
	}
}
