import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int arr1[]={1,2,3,4};
	    Solution ob=new Solution();
	    System.out.println(Arrays.toString(ob.runningSum(arr1)));
	}
}
