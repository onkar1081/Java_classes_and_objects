import java.util.*;
import java.io.*;
public class Main { 
    public static void main(String [] args)throws Exception{
    try{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int sub=b-a;
            int ans=sub/c;
            System.out.println(ans);
        }

        
    }catch(Exception e){
        System.out.println("Exception occured");
    }
}
}
