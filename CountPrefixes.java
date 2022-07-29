import java.util.*;
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String s1:words){
            if(s.startsWith(s1)){
                count++;
            }
        }
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		String arr[]={"a","b","c","ab","bc","abc"};
		String b="abc";
		System.out.println(ob.countPrefixes(arr,b));
	}
}
