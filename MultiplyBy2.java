import java.util.*;
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int ans=original;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                ans=original;  
                 original=original*2;
                c=1;
            }
        }
        if(c==1){
            ans=ans*2;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int arr[]={5,3,6,1,12};
	    Solution ob=new Solution();
	    System.out.println(ob.findFinalValue(arr,3));
	}
}
