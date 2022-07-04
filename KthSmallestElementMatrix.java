import java.util.*;
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<mat.length; i++) {
        for(int j=0; j<mat[i].length; j++) {
           list.add(mat[i][j]);
        }
    }
        Collections.sort(list);
        int ans=0;
        if(list.size()==1){
            ans=list.get(0);
        }else{
        for(int i=0;i<list.size();i++){
            if(k-1==i){
                ans=list.get(i);
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
		int[][]mat={{1,5,9},{10,11,13},{12,13,15}};
		int k=8;
		System.out.println(ob.kthSmallest(mat,k));
	}
}
