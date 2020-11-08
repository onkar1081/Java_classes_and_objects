package buffer;
import java.io.*;
public class Buffer {
    public static void main(String[] args) throws Exception{
       FileInputStream fin=new FileInputStream("c:\\javaprog\\test.txt");
       BufferedInputStream bin=new BufferedInputStream(fin);
       FileOutputStream fout=new FileOutputStream("c:\\javaprog\\test10.txt");
       BufferedOutputStream bout=new BufferedOutputStream(fout);
       int x;
       while((x=bin.read())!=-1){
           bout.write(x);
       }
       bout.flush();
       fout.close();
       fin.close();
        System.out.println("File Copied");
    }  
}
