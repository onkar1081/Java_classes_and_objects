package buffer1;
import java.io.*;
public class Buffer1 {
    public static void main(String[] args) throws Exception{
       byte[] arr=new byte[1024];
       FileInputStream fin=new FileInputStream("c:\\javaprog\\test.txt");
       BufferedInputStream bin=new BufferedInputStream(fin);
       FileOutputStream fout=new FileOutputStream("c:\\javaprog\\test10.txt");
       BufferedOutputStream bout=new BufferedOutputStream(fout); 
       while(bin.read(arr,0,arr.length)!=-1){
           bout.write(arr);
       }
       bout.flush();
       fout.close();
       fin.close();
       System.out.println("File Copied");
    }  
}
