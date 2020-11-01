package stringbuffer2;
public class Stringbuffer2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello World");
        sb.append("Hi");
        sb.append(10);
        sb.append(3.14);
        System.out.println(sb);
        sb.deleteCharAt(18);
        System.out.println(sb);
        sb.delete(11, sb.length());
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("I  Java");
        System.out.println(sb1);
        sb1.insert(2, "LIKE");
        System.out.println(sb1);
        System.out.println(sb1.substring(2));
        System.out.println(sb1.substring(2, 5));
        System.out.println(sb1.replace(2, 6, "LOVE"));
        String s2=sb1.toString();
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
    }  
}
