import java.util.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		        int count=0;
		        int x=s.nextInt();
		        int k=s.nextInt();
		        int arr[]=new int[x];
		        for(int j=0;j<x;j++){
		           arr[j]=s.nextInt();
		        }
		        for(int j=0;j<x;j++){
		            if(arr[j]>k){
		                count++;
		            }
		        }
		        System.out.println(count);
		    }
		}catch(Exception e){
		    System.out.println("Exception "+e);
		}
	}
}
