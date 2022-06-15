class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char []arr1=jewels.toCharArray();
        char []arr2=stones.toCharArray();
        int count=0;
        for(char c:arr1){
            for(char c1:arr2){
                if(c==c1){
                    count++;
                }
            }
        }
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
        String a1="aA";
        String a2="aAAbbbb";
		int ans=ob.numJewelsInStones(a1,a2);
		System.out.println(ans);
	}
}
