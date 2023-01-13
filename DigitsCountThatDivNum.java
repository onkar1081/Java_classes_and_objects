class Solution {
    public int countDigits(int num) {
        int count=0;  
        String s1=Integer.toString(num);
        int arr[]=new int[s1.length()];
        for(int i=0;i<s1.length();i++){
            arr[i]=Integer.parseInt(s1.charAt(i)+"");
        }
       for(int x:arr){
           if(num%x==0){
               count++;
           }
       }
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
    	Solution ob=new Solution();
    	int a=1248;
    	System.out.println(ob.countDigits(a));
	}
}
