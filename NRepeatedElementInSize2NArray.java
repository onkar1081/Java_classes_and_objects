import java.util.*;
class Solution {
    public int repeatedNTimes(int[] nums) {
        int count=1,ans=0;
        for(int i=0;i<nums.length;i++){
            count=1;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    count++;
                }
            }
            if(count==(nums.length/2)){
                ans=nums[i];
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
		int [] nums={1,2,3,3};
		System.out.println(ob.repeatedNTimes(nums));
	}
}
