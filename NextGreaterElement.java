import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int c=0,temp=0,t1=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            temp=nums1[i];
            c=0;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==temp){
                    t1=j;
                }
            }
            for(int k=t1;k<nums2.length;k++){
                if(nums2[k]>temp){
                    list.add(nums2[k]);
                    c=1;
                    break;
                }
            }
            if(c==0){
                list.add(-1);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int nums1[]={4,1,2};
	    int nums2[]={1,3,4,2};
	    System.out.println(Arrays.toString(ob.nextGreaterElement(nums1,nums2)));
	}
}
