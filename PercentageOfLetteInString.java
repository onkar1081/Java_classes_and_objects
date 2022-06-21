import java.util.*;
class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(letter==s.charAt(i)){
                count++;
            }
        }
        int n=s.length();
        int ans=((count*100)/n);
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.percentageLetter("foobar",'o'));
	}
}
