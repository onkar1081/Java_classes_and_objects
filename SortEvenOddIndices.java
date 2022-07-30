import java.util.*;
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                list.add(nums[i]);
            }else{
                list1.add(nums[i]);
            }
        }
        Collections.sort(list1,Collections.reverseOrder());
        Collections.sort(list);
        int n=list.size()+list1.size();
        int a=0,b=0;
        for(int k=0;k<n;k++){
            if(k%2==0){
                list2.add(list.get(a));
                a++;
            }else{
                list2.add(list1.get(b));
                b++;
            }       
        }
        int arr[]=new int[list2.size()];
        for(int i=0;i<nums.length;i++){
            arr[i]=list2.get(i);
        }
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={4,1,2,3};
		System.out.println(Arrays.toString(ob.sortEvenOdd(arr)));
	}
}
