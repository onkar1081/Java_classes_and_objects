import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0){
            Arrays.sort(nums1);
        }else{
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> newList=new ArrayList<Integer>();
        for(int x:nums1){
            if(x!=0){
                list1.add(x);
            }   
        }
        //System.out.println(list1);
        for(int y:nums2){
           if(y!=0){
                list2.add(y);
            }
        }
        //System.out.println(list2);
        list1.addAll(list2);
        Collections.sort(list1);
        for(int i=0;i<list1.size();i++){
            nums1[i]=list1.get(i);
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int []arr1={1,2,3,0,0,0};
	    int [] arr2={2,5,6};
	    int a=3,b=3;
	    ob.merge(arr1,a,arr2,b);
	}
}
