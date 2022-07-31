import java.util.*;
class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int array[]={5,0,1,2,3,4};
		System.out.println(Arrays.toString(ob.buildArray(array)));
	}
}
