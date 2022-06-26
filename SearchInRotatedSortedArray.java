import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
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
		int arr[]={4,5,6,7,0,1,2};
		int tar=0;
		System.out.println(ob.search(arr,tar));
	}
}
