import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s1="helloworld";
		int n=s1.length();
		char []arr=s1.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
		    if(arr[i]==' '){
		       continue;
		    }else{
		         System.out.print(arr[i]);
		    }
		}
	}
}
