import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int temp=0,ans=nums[nums.length-1]+1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=temp){
                ans=temp;
                break;
            }
            temp++;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={3,0,1};
		System.out.println(ob.missingNumber(arr));
	}
}
