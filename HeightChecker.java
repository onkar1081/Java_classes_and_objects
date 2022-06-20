import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int []arr=new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,1,4,2,1,3};
	    Solution ob=new Solution();
	    System.out.println(ob.heightChecker(arr));
	}
}
