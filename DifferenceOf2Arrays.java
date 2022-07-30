import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list4=new ArrayList<>();
        List<List<Integer> > listOfLists = new ArrayList<List<Integer> >();
        
        for(int x:nums1){
            list1.add(x);
        }for(int y:list1){
            if(!list2.contains(y)){
                list2.add(y);
            }
        }
        for(int x:nums2){
            list3.add(x);
        }for(int y:list3){
            if(!list4.contains(y)){
                list4.add(y);
            }
        }
        list1.clear();
        list3.clear();
        for(int x:list2){
            if(!list4.contains(x)){
                list1.add(x);
            }
        }
         for(int x:list4){
            if(!list2.contains(x)){
                list3.add(x);
            }
        }
        listOfLists.add(list1);
        listOfLists.add(list3);
        return listOfLists;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={1,2,3};
		int arr1[]={2,4,6};
		System.out.println(ob.findDifference(arr,arr1));
	}
}
