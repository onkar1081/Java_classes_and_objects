import java.util.*;
class Solution {
    public boolean isMonotonic(int[] nums) {
        int arr[]=new int [nums.length];
        boolean ans=false;
     for(int i=0;i<nums.length;i++){
         arr[i]=nums[i];
     }
        Arrays.sort(arr);
        if(Arrays.toString(arr).equals(Arrays.toString(nums))){
            ans=true;
        }
        int j=0;
        int arr1[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            arr1[j]=arr[i];
            j++;
        }
        if(Arrays.toString(arr1).equals(Arrays.toString(nums))){
            ans=true;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int arr2[]={1,2,2,3};
	    System.out.println(ob.isMonotonic(arr2));
	}
}
