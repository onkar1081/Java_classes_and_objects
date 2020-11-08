package dataoutstream;
import java.io.*;
public class DataOutStream {
    public static void main(String[] args)throws Exception {
       FileInputStream fin=new FileInputStream("c:\\javaprog\\stud.dat");
       DataInputStream din=new DataInputStream(fin);
       int a=din.readInt();
       boolean b=din.readBoolean();
       double c=din.readDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        din.close();
    }   
}
