import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        int arr[]=new int[2];
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
        for(int i=0;i<2;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int []arr1={1,2,1,3,2,5};
		System.out.println(Arrays.toString(ob.singleNumber(arr1)));
	}
}
