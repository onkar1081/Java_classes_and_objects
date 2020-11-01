package trimfuncstring;
public class TrimFuncString {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="   Hello   ";
        if(s1.equals(s2.trim()))
        {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }   
}
