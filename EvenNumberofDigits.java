import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        String s1="";
        int count=0;
        for(int x:nums){
            s1=Integer.toString(x);
            if(s1.length()%2==0){
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
		int []arr={555,901,482,1771};
		System.out.println(ob.findNumbers(arr));
	}
}
