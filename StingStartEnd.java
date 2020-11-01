package stingstartend;
public class StingStartEnd {
    public static void main(String[] args) {
        String s1=new String("Hello World,My name is abc");
        System.out.println(s1.startsWith("Hello"));
        System.out.println(s1.startsWith("Hi"));
        System.out.println(s1.endsWith("abc"));
        System.out.println(s1.endsWith("xyz"));
    }  
}
