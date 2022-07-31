import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans=-1,ans1=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                ans1=i;
                break;
            }
        }
        int arr[]=new int[2];
        arr[0]=ans;
        arr[1]=ans1;
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int array[]={5,7,7,8,8,10};
		int tar=8;
		System.out.println(Arrays.toString(ob.searchRange(array,tar)));
	}
}
