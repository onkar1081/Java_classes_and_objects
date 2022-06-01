import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
class Solution 
{
    String reverseWords(String S)
    {
       String[] arr=S.split("[.]");
       String s2="";
       for(int i=arr.length-1;i>=0;i--){
           if(i==0){
               s2=s2+arr[i];
           }else{
               s2=s2+arr[i]+".";
           }
       }
       return s2;
    }
}
