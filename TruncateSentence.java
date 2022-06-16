import java.util.*;
class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]=s.split(" ");
        String s1="";
        for(int i=0;i<k;i++){
            s1=s1+arr[i]+" ";
        }
        s1=s1.trim();
        return s1;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    System.out.println(ob.truncateSentence("Hello how are you Contestant",4));
	}
}
