import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
    		   int points_now=s.nextInt();
    		   int atleast_points=s.nextInt();
    		   int games_left=s.nextInt();
    		   points_now=points_now+(2*games_left);
    		   if(points_now>=atleast_points){
    		       System.out.println("YES");
    		   }else{
    		       System.out.println("NO");
    		   }
		    }
		}catch(Exception e ){
		    System.out.println("Exception "+e);
		}
	}
}
