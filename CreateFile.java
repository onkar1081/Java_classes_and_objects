package createfile;
import java.io.*;
public class CreateFile {
    public static void main(String[] args)throws Exception {
        File f1=new File("c:/javaprog/test2.txt");
        boolean b=f1.createNewFile();
        System.out.println(b);
        File f2=new File("c:/javaprog/demo");
        boolean c=f2.mkdir();
        System.out.println(c);
        File f3=new File("c:/javaprog/a/b/c");
        boolean d=f3.mkdirs();
        System.out.println(d);
        
        
    }    
}
