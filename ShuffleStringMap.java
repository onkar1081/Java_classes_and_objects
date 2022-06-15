import java.util.*;
class Solution {
    public String restoreString(String s, int[] indices) {
         HashMap<Integer,String> map = new HashMap<>();
         String s2="";
         for(int i=0;i<indices.length;i++){
             map.put(indices[i],s.charAt(i)+"");
         }
         for (String s1 : map.values()) 
           s2=s2+s1;
        return s2; 
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
        String a1="codeleet";
        int []arr={4,5,6,7,0,2,1,3};
		String ans=ob.restoreString(a1,arr);
		System.out.println(ans);
	}
}
