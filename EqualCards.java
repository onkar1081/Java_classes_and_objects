import java.util.*;
import java.io.*;
public class Main { 
    public static void main(String [] args)throws Exception{
    try{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int x=52;
            int y=0;
            while(x%a!=0){
                    if(x%a!=0){
                        x=x-1;
                        y=52-x;
                    }
                }
                System.out.println(y);
            }
        }
    catch(Exception e){
        System.out.println("Exception occured");
    }
}
}
