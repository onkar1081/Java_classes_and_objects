class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=0;
          int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               ans=Math.abs(i-start);
                if(ans<min){
                    min=ans;
                }
            }
        }
        return min;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={1,2,3,4,5};
		System.out.println(ob.getMinDistance(arr,5,3));
	}
}
