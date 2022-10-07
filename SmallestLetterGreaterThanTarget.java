class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int c=0,d=target;
        char ans=' ';
        for(int i=0;i<letters.length;i++){
            c=letters[i];
            if(c>d){
                ans=letters[i];
                break;
            }
        }
        if(ans==' '){
            ans=letters[0];
        }
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		char [] a1={'c','f','j'};
		char b1='a';
		System.out.println(ob.nextGreatestLetter(a1,b1));
	}
}
