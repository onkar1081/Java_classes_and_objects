package pkgstatic.intializer.block;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticIntializerBlock {
        public static Scanner s=new Scanner(System.in);
        public static int B=s.nextInt();
        public static int H=s.nextInt(); 
        public static boolean flag;
    static{   
        if(B>=0 && H>=0){
            flag=true;
        }else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");         
        }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class











