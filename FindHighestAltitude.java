import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length+1];
        arr[0]=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            arr[i+1]=sum;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
        int [] arr1={-5,1,5,0,-7};
	    System.out.println(ob.largestAltitude(arr1));
	}
}
