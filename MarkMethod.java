package markmethod;
import java.io.*;
public class MarkMethod {
    public static void main(String[] args) {
        String msg = "Hello World";
        byte[] arr = msg.getBytes();
        ByteArrayInputStream bin = new ByteArrayInputStream(arr);
        int x;
        x=bin.read();
        System.out.println((char)x);
        bin.mark(2);
         x=bin.read();
        System.out.println((char)x);
        x=bin.read();
        System.out.println((char)x);
        x=bin.read();
        System.out.println((char)x);
        x=bin.read();
        System.out.println((char)x);
        System.out.println("After reset");
        bin.reset();
        x=bin.read();
        System.out.println((char)x);
    }   
}
