import java.util.*;

public class Main
{
	public static void main(String[] args) {
	try{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int amt=0,money=0,reqmoney=0,amt1=0;
	    int arr[]=new int[n];
	    int arr1[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	     for(int j=0;j<n;j++){
	        arr1[j]=s.nextInt();
	    }
	    for(int k=0;k<n;k++){
	       arr[k]=arr[k]-arr1[k];
	    }for(int k=0;k<n;k++){
	       System.out.println("Before sort "+arr[k]);
	    }
	    Arrays.sort(arr);
	    for(int k=0;k<n;k++){
	      System.out.println("After sort "+arr[k]);
	    }
	    int sum=0,ans=0;
	    for(int l=n-1;l>=0;l--){
	        sum=sum+arr[l];
	        if(sum<0){
	            sum=-sum;
	            ans=ans+sum;
	            sum=0;
	        }
	        
	    }
	    System.out.println(ans);
	}catch(Exception e){
	    System.out.println("Exception "+e);
	}
	}
}
