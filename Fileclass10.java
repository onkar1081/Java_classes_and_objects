package fileclass10;
import java.io.*;
import java.util.Date;
public class Fileclass10 {
    public static void main(String[] args) {
       File f1=new File("C:/javaprog/test1.txt");
       File f2=new File("C:/javaprog/test2.txt");
       File f3=new File("C:/javaprog/test3.txt");
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getParent());
        System.out.println(f1.length());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());        
        System.out.println(f1.exists());
        System.out.println(f3.exists());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.lastModified());
        Date d=new Date(f1.lastModified());
        System.out.println(d);
        System.out.println(f2.delete());
    }   
}
