import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s1="";
        if(word1.length()<=word2.length()){
        for(int i=0;i<word1.length();i++){
            s1=s1+word1.charAt(i);
            s1=s1+word2.charAt(i);
        
        }
            for(int j=word1.length();j<word2.length();j++){
                s1=s1+word2.charAt(j);
            }
        }else{
         for(int i=0;i<word2.length();i++){
            s1=s1+word1.charAt(i);
            s1=s1+word2.charAt(i);
         }
             for(int j=word2.length();j<word1.length();j++){
                s1=s1+word1.charAt(j);
            }
        }
        return s1;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    String a1="ab";
	    String b1="pqrs";
	    System.out.println(ob.mergeAlternately(a1,b1));
	}
}
