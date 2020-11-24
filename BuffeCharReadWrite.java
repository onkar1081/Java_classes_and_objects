package buffecharreadwrite;
import java.io.*;
public class BuffeCharReadWrite {
    public static void main(String[] args) throws Exception{
        FileReader fin=new FileReader("c:\\javaprog\\check.txt");
        BufferedReader bin=new BufferedReader(fin);
        FileWriter fout =new FileWriter("c:\\javaprog\\checked200.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        String line="";
        while((line=bin.readLine())!=null) {            
            bout.write(line);
        }
        fin.close();
        bout.close();
        fout.close();
        System.out.println("File Saved");
    }  
}
