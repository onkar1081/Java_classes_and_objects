class Solution {
    public int findComplement(int num) {
        String s1=Integer.toBinaryString(num);
        s1=s1.replaceAll("0","2");
        s1=s1.replaceAll("1","0");
        s1=s1.replaceAll("2","1");
        int decimal=Integer.parseInt(s1,2); 
        return decimal;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int n=5;
		System.out.println(ob.findComplement(n));
	}
}
