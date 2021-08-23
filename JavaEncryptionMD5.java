import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.security.*;
public class Solution {
    public static void main(String[] args) {
        try {
            Scanner s=new Scanner(System.in);
            String s1=s.next();
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(s1.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            System.out.println(hashtext);
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
