import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int a=s.nextInt();
		    int num=a*3;
        int k=num-(num/3)-1;
			System.out.println(k+" "+num/3+" "+1);
		}
	}
}
