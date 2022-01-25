import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
    		    int total=s.nextInt();
    		    int infected=s.nextInt();
    		    int non_infected=total-infected;		        
		    if(infected>non_infected){
		        System.out.println(non_infected);
		    }else{
		        System.out.println(infected);
		    }
		    }
		}catch(Exception e ){
		    System.out.println("Exception "+e);
		}
	}
}
