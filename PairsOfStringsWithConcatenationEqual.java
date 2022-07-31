import java.util.*;
class Solution {
    public int numOfPairs(String[] nums, String target) {
        String s1="";
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j ){
                    s1=nums[i]+nums[j];
                    if(s1.equals(target)){
                        System.out.println(nums[i]+" "+nums[j]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		String array[]={"777","7","77","77"};
		String tar="7777";
		System.out.println(ob.numOfPairs(array,tar));
	}
}
