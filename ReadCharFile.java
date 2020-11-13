package readcharfile;
import java.io.*;
public class ReadCharFile {
    public static void main(String[] args) throws Exception{
        FileReader fin=new FileReader("c:\\javaprog\\check.txt");
        int x;
        do{
            x=fin.read();
            if(x!=-1){
                System.out.print((char)x);
            }
        }while((x!=-1));
        fin.close();
    }  
}
