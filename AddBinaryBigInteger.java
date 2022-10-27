import java.math.*;
import java.util.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger b1=new BigInteger(a,2);
        BigInteger b2=new BigInteger(b,2);
        BigInteger b3=b1.add(b2);
        String s3 = b3.toString(2);
        return s3;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.addBinary("11","1"));
	}
}
