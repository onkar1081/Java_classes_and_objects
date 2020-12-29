package networking1;
import java.net.*;
public class Networking1 {
    public static void main(String[] args) throws Exception {
        InetAddress ob;
        ob=InetAddress.getByName("google.com");
        System.out.println(ob.getHostAddress());
        System.out.println(ob.getHostName());
        byte[] arr=ob.getAddress();
        for (byte b : arr) {
            System.out.println(b);
        }       
    }    
}
