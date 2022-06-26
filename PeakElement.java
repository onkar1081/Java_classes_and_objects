import java.util.*;
class Solution {
    public int findPeakElement(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        int ans=0;
        int temp=nums[(nums.length-1)];
        for(int i=0;i<arr.length;i++){
            if(temp==arr[i]){
                ans=i;
            }
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={1,2,3,1};
		System.out.println(ob.findPeakElement(arr));
	}
}
