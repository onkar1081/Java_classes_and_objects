import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		        int ques=s.nextInt();
		        int correct_ans=s.nextInt();
		        int pass_marks=s.nextInt();
		        int incorrect_ans=ques-correct_ans;
		        int total_marks=(correct_ans*3)+(incorrect_ans*(-1));
		        if(total_marks>=pass_marks){
		            System.out.println("PASS");
		        }else{
		            System.out.println("FAIL");
		        }
		    }
		}catch(Exception e){
		    System.out.println("Exception occured "+e);
		}
	}
}
