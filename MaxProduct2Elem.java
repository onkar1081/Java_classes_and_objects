import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums[nums.length-1]-1;
        int b=nums[nums.length-2]-1;
        return a*b;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={3,4,5,2};
		System.out.println(ob.maxProduct(arr));
	}
}
