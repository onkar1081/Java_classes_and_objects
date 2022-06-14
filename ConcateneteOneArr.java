import java.util.*;
class Solution{
     public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list =new ArrayList<Integer>();   
        for(int x:nums){
            list.add(x);
        }
        for(int y:nums){
            list.add(y);
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
		int arr1[]={1,2,3,4};
		Solution s1=new Solution();
		int arr2[]=s1.getConcatenation(arr1);
		for(int x:arr2){
		    System.out.println(x);
		}
	}
}
