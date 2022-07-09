import java.util.*;
class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].contains(words[j]) && i!=j){
                    list.add(words[j]);
                }
            }
        }
        for(String s1:list){
            if(!list1.contains(s1)){
                list1.add(s1);
            }
        }
        return list1;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    String [] arr={"mass","as","hero","superhero"};
	    System.out.println(ob.stringMatching(arr));
	}
}
