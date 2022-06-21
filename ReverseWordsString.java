import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        String s3=" ";
        for(int i=arr.length-1;i>=0;i--){
            s3=s3+arr[i]+" ";
        }
        s3=s3.replaceAll("\\s{2,}", " ").trim();
        return s3;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    System.out.println(ob.reverseWords("the sky is blue"));
	}
}
