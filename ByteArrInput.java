package bytearrinput;
import java.io.*;
public class ByteArrInput {
    public static void main(String[] args) {
        String msg = "Hello World";
        byte[] arr = msg.getBytes();
        ByteArrayInputStream bin = new ByteArrayInputStream(arr);
        int x;
        System.out.println(bin.available());
        do {
            x = bin.read();
            if (x != -1) {
                System.out.println((char) x);
            }
        } while (x != -1);
        System.out.println("Second time");
        bin.reset();
        do {
            x = bin.read();
            if (x != -1) {
                System.out.println((char) x);
            }
        } while (x != -1);
    }
}
