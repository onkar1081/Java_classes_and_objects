package netorkingurlconnection3;
import java.net.*;
import java.io.*;
public class NetorkingURLConnection3 {
    public static void main(String[] args) throws Exception{
        URL url;
        url=new URL("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_480_1_5MG.mp4");
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
        URLConnection con=url.openConnection();
        FileOutputStream fout=new FileOutputStream("D:\\tp\\testing.mp4");
        InputStream in=con.getInputStream();
        int x;
        do {            
            x=in.read();
            if(x!=-1){
                fout.write(x);
            }
        } while (x!=-1);
        fout.close();
        System.out.println("File Copied");
    }    
}
