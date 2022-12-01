
class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        int half=len/2;
        boolean ans=false;
        System.out.println(len+" "+half);
        String s1=s.substring(0,half);
        System.out.println(s1);
        String s2=s.substring(half,len);        
        System.out.println(s2);
        int count=0,count1=0,count2=0,count3=0;
        char c=' ';
        for(int i=0;i<s1.length();i++){
            c=s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }else{
                count1++;
            }
        }
        for(int i=0;i<s2.length();i++){
            c=s2.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count2++;
            }else{
                count3++;
            }
        }
        if(count==count2 && count1==count3){
            ans=true;
        }
        System.out.println(count+" "+count1+" "+count2+" "+count3);
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.halvesAreAlike("textbook"));
	}
}
