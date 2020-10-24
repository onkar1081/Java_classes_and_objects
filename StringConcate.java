package stringconcate;
public class StringConcate {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("World");
        String s3=s1+s2;
        System.out.println(s3);
        s3+=100;
        System.out.println(s3);
        String name="abc";
        int age=20;
        String s4="My name is "+name+" and my age is "+age;
        System.out.println(s4);     
    }   
}
