class Solution {
    public int maximumDifference(int[] nums) {
        int diff=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i<j && nums[i]<nums[j]){
                    diff=nums[j]-nums[i];
                    list.add(diff);
                }
            }
        }
        Collections.sort(list);
        int ans=0;
        try{
         ans=list.get(list.size()-1);
        }catch(Exception e){
            ans=-1;
        }
        return ans;
    }
}
