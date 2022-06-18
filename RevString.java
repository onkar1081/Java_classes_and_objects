class Solution {
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        String s2="",s3="";
        for(String s1:arr){
            s2="";
            for(int i=s1.length()-1;i>=0;i--){
                s2=s2+s1.charAt(i);
            }
            s3=s3+s2+" ";
        }
        s3=s3.trim();
        return s3;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.reverseWords("Let's take LeetCode contest"));
	}
}
