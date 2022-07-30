import java.util.*;
class Solution {
    public boolean isSumEqual(String f1, String s1, String t1) {
        int j=97;
        char c=' ',c1=' ';
        int sum=0,x=0,sum1=0,sum2=0;
        boolean ans=false;
        String s11="";
        String s2="";
        String s3="";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<10;i++){
           c=(char)j;
            map.put(c,i);
            j++;
        }
        for(int i=0;i<f1.length();i++){
            c1=f1.charAt(i);
            if(map.containsKey(c1)){
                x=map.get(c1);
            }
            s11=s11+x;
        }
        for(int i=0;i<s1.length();i++){
            c1=s1.charAt(i);
            if(map.containsKey(c1)){
                x=map.get(c1);
            }
            s2=s2+x;
        }
        for(int i=0;i<t1.length();i++){
            c1=t1.charAt(i);
            if(map.containsKey(c1)){
                x=map.get(c1);
            }
            s3=s3+x;
        }
        int a1=Integer.parseInt(s11);
        int a2=Integer.parseInt(s2);
        int a3=Integer.parseInt(s3);
        if(a1+a2==a3){
            ans=true;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		String a="acb";
		String b="cba";
		String c="cdb";
		System.out.println(ob.isSumEqual(a,b,c));
	}
}
