package throwskeyword;
public class ThrowsKeyword {
    public static void main(String[] args) {
        int c;
        try {
             c=div(5,0);            
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    static int div (int x,int y) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int [] arr=new int[5];
        int z=0;
        z=x/y;
        return z;
    }
}
