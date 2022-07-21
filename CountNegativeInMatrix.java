import java.util.*;
class Solution {
    public int countNegatives(int[][] array) {
        int count=0;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                if(array[i][j]<0){
                    count++;
                }
            }
        }
        return count++;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int arr1[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
	    System.out.println(ob.countNegatives(arr1));
	}
}
