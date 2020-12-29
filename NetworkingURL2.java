package networkingurl2;
import java.net.*;
public class NetworkingURL2 {
    public static void main(String[] args)throws Exception {
        URL url;
        url=new URL("https://www.google.com/");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
    }    
}
