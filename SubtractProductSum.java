import java.util.*;
class Solution {
    public int subtractProductAndSum(int n) {
        String s1=Integer.toString(n);
        int x=0,mult=1,sum=0;
        for(int i=0;i<s1.length();i++){
            x=Integer.parseInt(s1.charAt(i)+"");
            sum=sum+x;
            mult=mult*x;
        }
        int ans=mult-sum;
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int m=234;
		System.out.println(ob.subtractProductAndSum(m));
	}
}
