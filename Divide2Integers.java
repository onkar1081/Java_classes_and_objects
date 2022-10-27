import java.math.*;
import java.util.*;
import java.math.*;
class Solution {
    public int divide(int dividend, int divisor) { 
       int ans=dividend/divisor;
        if(ans==-2147483648 && dividend==-2147483648 && divisor==-1){
            ans=2147483647;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.divide(10,3));
	}
}
