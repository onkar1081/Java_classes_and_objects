import java.util.*;
class Solution {
    public int[] countBits(int n) {
        String ans="";
        int arr[]=new int[n+1];
        int count=0;
        for(int i=0;i<=n;i++){
            ans=Integer.toBinaryString(i);
            count=0;
                for(int j=0;j<ans.length();j++){
                    if(ans.charAt(j)=='1'){
                    count++;
                    }
        }
            arr[i]=count;
        }    
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(Arrays.toString(ob.countBits(5)));
	}
}
