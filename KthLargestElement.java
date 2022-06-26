import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans=0,temp=0;
        Arrays.sort(nums);
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            temp=nums[i];
            arr[j]=temp;
            j++;
        }
        for(int i=0;i<arr.length;i++){
            if(k-1==i){
                ans=arr[i];
            }
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={3,2,1,5,6,4};
		int n=2;
		System.out.println(ob.findKthLargest(arr,n));
	}
}
