import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        double sum=0;
        for(int x:nums1){
            list.add(x);
        }
        for(int y:nums2){
            list.add(y);
        }
        Collections.sort(list);
        int ans=0;
        double res=0;
        int n=list.size();
        if(list.size()%2==0){
            ans=list.get(n/2)+list.get((n/2)-1);
             res=(double)ans/2.0;
        }else{
            ans=list.get(n/2);
            res=(double)ans;
        }
        return res;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int []arr={1,3};
	    int []arr1={2};
	    System.out.println(ob.findMedianSortedArrays(arr,arr1));
	}
}
