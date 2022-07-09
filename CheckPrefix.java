class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[]=sentence.split(" ");
        int ans=-1;
        String s1="";
        for(int i=0;i<arr.length;i++){
            s1=arr[i];
            if(s1.startsWith(searchWord)  ){
                ans=i+1;
                break;
            }
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    String a1="i love eating burger",a2="burg";
	    System.out.println(ob.isPrefixOfWord(a1,a2));
	}
}
