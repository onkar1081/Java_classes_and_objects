package writecharfile;
import java.io.*;
public class WriteCharFile {
    public static void main(String[] args) throws Exception{
        FileReader fin=new FileReader("c:\\javaprog\\check.txt");
        FileWriter fout=new FileWriter("c:\\javaprog\\check10.txt");
        int x;
        do{
            x=fin.read();
            if(x!=-1)
            {
                fout.write(x);
            }
        }while(x!=-1);
        fin.close();
        fout.close();
        System.out.println("File Copied");
    } 
}
