import java.math.*;
import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        String s1="";
        for(int x:digits){
            s1=s1+x;
        }
        String one="1";
        BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(one);
         BigInteger b3;
        b3=b1.add(b2);
        String ans=b3.toString();
        char c=' ';
        int arr[]=new int[ans.length()];
        for(int i=0;i<ans.length();i++){
            c=ans.charAt(i);
            arr[i]=Integer.parseInt(c+"");
        }
        return arr;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int arr[]={1,2,3};
		System.out.println(Arrays.toString(ob.plusOne((arr))));
	}
}
