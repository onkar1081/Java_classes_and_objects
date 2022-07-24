import java.util.*;
class Solution {
    public boolean searchMatrix(int[][] array, int target) {
        boolean ans=false;
   for (int i = 0; i<array.length; i++){
     for (int j = 0; j<array[i].length; j++){
        if(array[i][j]==target){
            ans=true;
            break;
        }
     } 
   }
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int t=5;
		System.out.println(ob.searchMatrix(arr,t));
	}
}
