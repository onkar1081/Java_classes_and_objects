package readfile;
import java.io.*;
public class ReadFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fin=new FileInputStream("c:\\javaprog\\test.txt");
        int x;
        System.out.println(fin.available());
        fin.skip(2);
        do{
             x=fin.read();
             if(x!=-1)
             {
                System.out.println((char)x); 
             }
        }while(x!=-1);
        fin.close(); 
              
    }   
}
