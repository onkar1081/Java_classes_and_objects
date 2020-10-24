package throwkeyword;
public class ThrowKeyword {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 0;
        try {
            if (b == 0) {
                ArithmeticException ob=new ArithmeticException();
                throw ob;
            }
            c = a / b;
            System.out.println("Div is " + c);
        } catch (ArithmeticException e) {
           System.out.println("Cannot div by zero");
        }
    }
}
