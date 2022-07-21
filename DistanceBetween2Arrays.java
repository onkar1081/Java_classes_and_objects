import java.util.*;
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int temp=0,count=0,count1=0;
        for(int i=0;i<arr1.length;i++){
            count=0;
            for(int j=0;j<arr2.length;j++){
                temp=arr1[i]-arr2[j];
                if(temp<0){
                    temp=temp*(-1);
                }
                if(temp>d ){
                    count++;
                }else{
                    break;
                }
            }
            if(count==arr2.length){
                count1++;
            }
        }
        return count1;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution ob=new Solution();
	    int arr1[]={4,5,8};
	    int arr2[]={10,9,1,8};
	    int d=2;
	    System.out.println(ob.findTheDistanceValue(arr1,arr2,d));
	}
}
