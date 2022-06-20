import java.util.*;
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int c=0;
        boolean ans=false;
        Arrays.sort(arr);
        Arrays.sort(target);
        for(int i=0;i<arr.length;i++){
            if(target[i]==arr[i]){
                c=1;
            }else{
                c=0;
                break;
            }
        }
        if(c==1){
            ans=true;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,4};
	    int target[]={2,4,1,3};
	    Solution ob=new Solution();
	    System.out.println(ob.canBeEqual(target,arr));
	}
}
