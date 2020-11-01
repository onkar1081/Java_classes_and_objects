package modifyingstring;
public class ModifyingString {
    public static void main(String[] args) {
        String s1=new String("Hello World");
        System.out.println(s1.substring(1, 7));
        System.out.println(s1.substring(3));
        String s2="Hello";
        String s3="World";
        String s4=s2.concat(s3);
        System.out.println(s4);
        String s5=s2.replace("H", "h");
        System.out.println(s2);
        System.out.println(s5);
    }  
}
