import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger b1=new BigInteger(num1);
         BigInteger b2=new BigInteger(num2);
        BigInteger b3=b1.add(b2);
        String ans=b3.toString();
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.addStrings("123","456"));
	}
}
