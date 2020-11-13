package readchararray;
import java.io.*;
public class ReadCharArray {
    public static void main(String[] args) throws Exception{
        String msg="Hello World";
        char[] arr=msg.toCharArray();
        CharArrayReader bin=new CharArrayReader(arr);
        int x;
        do {      
            x=bin.read();
            if(x!=-1)
            {
                System.out.println((char)x);
            }
        } while (x!=-1);
    }   
}
