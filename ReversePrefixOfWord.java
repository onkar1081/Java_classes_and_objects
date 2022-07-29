import java.util.*;
class Solution {
    public String reversePrefix(String word, char ch) {
        int index=0;
        String s1="",s2="",s3="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        for(int i=0;i<word.length();i++){
            if(i<=index){
                s1=s1+word.charAt(i);
            }else{
                s2=s2+word.charAt(i);
            }
        }
        for(int i=s1.length()-1;i>=0;i--){
            s3=s3+s1.charAt(i);
        }
        return s3+s2;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		String a="abcdefd";
		char b='d';
		System.out.println(ob.reversePrefix(a,b));
	}
}
