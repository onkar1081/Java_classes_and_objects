import java.util.*;
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
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
		String array[]={"pay","attention","practice","attend"};
		String tar="at";
		System.out.println(ob.prefixCount(array,tar));
	}
}
