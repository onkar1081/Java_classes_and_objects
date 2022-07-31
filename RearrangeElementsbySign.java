import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                    list.add(list1.get(a));
                    a++;
            }else{    
                    list.add(list2.get(b));
                    b++;
            }
        }
        int arr[]=new int[nums.length];
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
		int array[]={3,1,-2,-5,2,-4};
		System.out.println(Arrays.toString(ob.rearrangeArray(array)));
	}
}
