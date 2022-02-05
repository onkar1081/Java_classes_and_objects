import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=s.nextInt();
            }
            Arrays.sort(arr);
            int sum=0,diff=0;
            for(int k=n-1;k>0;k--){
                diff=arr[k]-arr[k-1];
                if(diff<0){
                    diff=-(diff);
                }
                sum=sum+diff;
            }
            System.out.println(sum);
        }
   }
}
