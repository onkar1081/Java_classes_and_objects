import java.util.*;
class Solution {
    public int maximumWealth(int[][] array) {
        int sum=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
    for (int i = 0; i<array.length; i++){
        sum=0;
       for (int j = 0; j<array[i].length; j++){
            sum=sum+array[i][j];
            list.add(sum);
         } 
       }
        Collections.sort(list);
        int ans=list.get(list.size()-1);
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int arr1[][]={{1,2,3},{3,2,1},{1,4,2}};
	    Solution ob=new Solution();
	    System.out.println(ob.maximumWealth(arr1));
	}
}
