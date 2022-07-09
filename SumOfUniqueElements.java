import java.util.*;
class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                list.add(nums[i]);
            }
        }
        for(int x:list){
            sum=sum+x;
        }
        return sum;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
        int [] arr1={1,2,3,2};
	    System.out.println(ob.sumOfUnique(arr1));
	}
}
