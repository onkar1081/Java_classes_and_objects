import java.util.*;
class Solution {
    public int smallestEqual(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={4,3,2,1};
		System.out.println(ob.smallestEqual(arr));
	}
}
