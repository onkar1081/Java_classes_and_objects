class Solution {
    public String capitalizeTitle(String title) {
        String s2="";
        char c1=' ',c2=' ';
        int x=0;
        String []arr=title.split(" ");
        for(String s1:arr){
            s1=s1.toLowerCase();
            if(s1.length()>2){
            c1=s1.charAt(0);
            x=c1-32;
            c2=(char)x;
            s1=s1.replaceFirst(c1+"",c2+"");
            }
            s2=s2+s1+" ";
        }
        s2=s2.trim();
        return s2;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    System.out.println(ob.capitalizeTitle("capiTalIze tHe titLe"));
	}
}
