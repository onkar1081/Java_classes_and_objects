class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans=1;
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=max;i>=2;i--){
            if(max%i==0 && min%i==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
