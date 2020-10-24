package stringcharextraction;
public class StringCharExtraction {
    public static void main(String[] args) {
        String s1="Hello World";
        int x=s1.length();
        System.out.println(x);
        System.out.println(s1.charAt(0));
        char y=s1.charAt(4);
        System.out.println(y);
        char[] arr=s1.toCharArray() ;
        for (char c : arr) {
            System.out.println(c); 
        }  
        byte[] arr1=s1.getBytes();
        for(int i=0;i<arr1.length   ;i++)
        {
            System.out.println(arr1[i]);
        }      
    } 
}
