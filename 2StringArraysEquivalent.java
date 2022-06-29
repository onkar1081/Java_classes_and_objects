import java.util.*;
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean ans=false;
        String s2="",s3="";
        for(String s1:word1){
            s2=s2+s1;
        }
        for(String s1:word2){
            s3=s3+s1;
        }
        if(s2.equals(s3)){
            ans=true;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		String arr[]={"ab", "c"};
		String arr1[]={"a", "bc"};
		System.out.println(ob.arrayStringsAreEqual(arr,arr1));
	}
}
