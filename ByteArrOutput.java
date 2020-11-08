package bytearroutput;
import java.io.*;
public class ByteArrOutput {
    public static void main(String[] args) throws Exception{
       String msg = "Hello World";
       byte[] arr = msg.getBytes();
       ByteArrayOutputStream bout=new ByteArrayOutputStream();
       bout.write(arr);
       FileOutputStream fout=new FileOutputStream("c:\\javaprog\\test50.txt");
       bout.writeTo(fout);
       fout.close();
        System.out.println("File Saved");
    }  
}
