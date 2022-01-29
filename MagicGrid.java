import java.util.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		        int x=s.nextInt();
		        int arr[][]=new int[x][x];
		        for(int j=0;j<x;j++){
		            for(int k=0;k<x;k++){
		                arr[j][k]=1;
		            }
		        }
		        for(int j=0;j<x;j++){
		            for(int k=0;k<x;k++){
		                System.out.print(arr[j][k]+" ");
		            }
		            System.out.println();
		        }
		    }
		}catch(Exception e){
		    System.out.println("Exception "+e);
		}
	}
}
