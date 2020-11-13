package writechararray;
import java.io.*;
public class WriteCharArray {
    public static void main(String[] args) throws Exception{
        CharArrayWriter bout=new CharArrayWriter();
        String msg="Hello World";
        char[] arr=msg.toCharArray();
        bout.write(arr);
        FileWriter fout=new FileWriter("c:\\javaprog\\check150.txt");
        bout.writeTo(fout);
        fout.close();
        System.out.println("File Saved");       
    } 
}
