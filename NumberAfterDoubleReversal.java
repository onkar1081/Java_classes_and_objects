import java.util.*;
class Solution {
    public boolean isSameAfterReversals(int num) {
        boolean ans=false;
        if(num==0){
            ans=true;
        }else{
        String s1=Integer.toString(num);
        String s2="";
        
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        } 
        if(s2.startsWith("0")){
            ans=false;
        }else{
            ans=true;
        }
        }
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		int m=526;
		System.out.println(ob.isSameAfterReversals(m));
	}
}
