class Solution {
    public int maximumCount(int[] nums) {    
        int c=0,c1=0,ans=0;    
        for(int x:nums){
            if(x>0){
                c++;
            }if(x<0){
                c1++;
            }
        }
        ans=c1;
        if(c>c1){
            ans=c;
        }
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={-2,-1,-1,1,2,3};
		System.out.println(ob.maximumCount(arr));
	}
}
