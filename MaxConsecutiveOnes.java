import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        if(nums.length==0){
            ans=0;
        }else if(nums.length==1){
            if(nums[0]==0){
                ans=0;
            }else{
                ans=1;
            }
        }else{
        String s1="";
      for(int x:nums){
          s1=s1+x;
      }
        String arr[]=s1.split("0");
        int y=0;
        ArrayList<Integer> list1=new ArrayList<>();
        for(String s2:arr){
           y=s2.length();
            list1.add(y);
        }
        try{
        Collections.sort(list1);
        ans=list1.get(list1.size()-1);
        }catch(Exception e){
            ans=0;
        }
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int nums1[]={1,1,0,1,1,1};
	    System.out.println(ob.findMaxConsecutiveOnes(nums1));
	}
}
