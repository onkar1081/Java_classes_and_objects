package filelist;
import java.io.File;
public class FileList {
    public static void main(String[] args) throws Exception{
       File f1=new File("c:/javaprog");
       String []arr =f1.list();
       for (String s : arr) {
           System.out.println(s);
        }
       File []arr1=f1.listFiles();
        for (File f2 : arr1) {
            if(f2.isFile()){
                System.out.println("File :"+f2.getName());
            }
            else{
                System.out.println("Dir :"+f2.getName());
            }
        } 
    }  
}
