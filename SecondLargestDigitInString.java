import java.util.*;
class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||
              s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||
              s.charAt(i)=='8'||s.charAt(i)=='9'){
                list.add(Integer.parseInt(s.charAt(i)+""));
            }
        }
        Collections.sort(list);
        ArrayList<Integer> list1=new ArrayList<>();
        for(int x:list){
            if(!list1.contains(x)){
                list1.add(x);
            }
        }
        int ans=0;
        if(list1.size()<=1){
            ans=-1;
        }else{
            ans=list1.get(list1.size()-2);
        }
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.secondHighest("dfa12321afd"));
	}
}
