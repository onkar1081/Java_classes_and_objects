import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans=false;
        ArrayList<Character> list=new ArrayList<Character>();
        ArrayList<Character> list1=new ArrayList<Character>();
        for(int i=0;i<sentence.length();i++){
            list.add(sentence.charAt(i));
        }
        for(char c1:list){
            if(!list1.contains(c1)){
                list1.add(c1);
            }
        }
        if(list1.size()==26){
            ans=true;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    System.out.println(ob.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
}
