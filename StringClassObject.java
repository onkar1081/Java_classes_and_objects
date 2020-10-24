package stringclassobject;
public class StringClassObject {
    public static void main(String[] args) {
       char[] arr={'A','B','C','D'};
       String s1=new String(arr);
        System.out.println(s1);
        byte[] arr1={65,66,67,68};
        String s2=new String(arr1);
        System.out.println(s2);
        String s3=new String(s2);
        System.out.println(s3);
    }  
}
