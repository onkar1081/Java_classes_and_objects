package datainstream;
import java.io.*;
public class DataInStream {
    public static void main(String[] args) throws Exception{
       FileOutputStream fout=new FileOutputStream("c:\\javaprog\\stud.dat");
       DataOutputStream dout =new DataOutputStream(fout);
       dout.writeInt(700);
       dout.writeBoolean(true);
       dout.writeDouble(3.14);
       dout.close();
       System.out.println("File Saved");
    }
}
