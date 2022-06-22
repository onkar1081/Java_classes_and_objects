import java.util.*;
class Solution {
    public int countEven(int num) {
        int rev=0,rem=0,count=0,temp=0;
        for(int i=2;i<=num;i++){
             temp=i;
            rev=0;
            rem=0;
            while(temp!=0){
            rem=temp%10;
            rev=rem+rev;
            temp=temp/10;
            }
            if(rev%2==0){
                count++;
            }
        }
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
        System.out.println(ob.countEven(30));
	}
}
