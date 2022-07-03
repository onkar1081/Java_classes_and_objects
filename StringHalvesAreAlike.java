class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String s1="",s2="";
        boolean ans=false;
        int count=0,count1=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                s1=s1+s.charAt(i);
            }else{
                s2=s2+s.charAt(i);
            }
        }
        for(int i=0;i<s1.length();i++){ 
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||
                s1.charAt(i)=='o'|| s1.charAt(i)=='u'){
                count++;
            }if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||
                s2.charAt(i)=='o'|| s2.charAt(i)=='u'){
                count1++;
            }
        }
        if(count1==count){
            ans=true;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    System.out.println(ob.halvesAreAlike("book"));
	}
}
