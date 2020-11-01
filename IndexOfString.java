package indexofstring;
public class IndexOfString {
    public static void main(String[] args) {
        String s1="Hello World";
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));
        String s2="Helol World";
        int x=s2.indexOf("l");
        System.out.println(s2.indexOf("l", x+1));
    }   
}
