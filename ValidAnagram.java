import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char []arr1=s.toCharArray();
        char []arr2=t.toCharArray();
        boolean ans=false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            ans=false;
        }else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==arr2[i]){
                    ans=true;
                }else{
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.isAnagram("anagram","nagaram"));
	}
}
