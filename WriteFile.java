package writefile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class WriteFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fin=new FileInputStream("c:\\javaprog\\test.txt");
        FileOutputStream fout=new FileOutputStream("c:\\javaprog\\test10.txt");
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
