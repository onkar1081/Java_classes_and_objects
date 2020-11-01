package stringbuffer1;
public class Stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println("Length: "+sb.length());
        System.out.println("Length: "+sb.capacity());
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        System.out.println(sb.reverse());
    }   
}
