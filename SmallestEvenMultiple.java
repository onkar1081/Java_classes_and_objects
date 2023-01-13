class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        for(int i=n;i<=(2*n);i++){
            if(i%n==0 && i%2==0){
                ans=i;
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
		int a=5;
		System.out.println(ob.smallestEvenMultiple(a));
	}
}
