import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j] &&i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,1,1,3};
		Solution ob=new Solution();
		System.out.println(ob.numIdenticalPairs(arr));
	}
}
