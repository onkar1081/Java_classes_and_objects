import java.util.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		        int x1=s.nextInt();
		        int y1=s.nextInt();
		        int x2=s.nextInt();
		        int y2=s.nextInt();
		        if(x1==x2 || y1==y2){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		}catch(Exception e){
		    System.out.println("Exception "+e);
		}
	}
}
