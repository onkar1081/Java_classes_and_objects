import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=(-1)*nums[i];
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        return nums;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int arr[]={10,20,-30,40};
	    System.out.println(Arrays.toString(ob.sortedSquares(arr)));
	}
}
