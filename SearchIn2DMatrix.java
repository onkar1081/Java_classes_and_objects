import java.util.*;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     boolean ans=false;
    for (int i = 0; i<matrix.length; i++){
     for (int j = 0; j<matrix[i].length; j++){
            if(matrix[i][j]==target){
                ans =true;
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
	    int [][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
	    int tar=3;
	    System.out.println(ob.searchMatrix(arr,tar));
	}
}
