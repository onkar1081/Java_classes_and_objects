import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && i!=j){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {   
	    Solution ob=new Solution();
	    int arr1[]={8,1,2,2,3};
	    System.out.println(Arrays.toString(ob.smallerNumbersThanCurrent(arr1)));
	}
}
