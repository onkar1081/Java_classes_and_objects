package finally1;
public class Finally1 {
    static void first()
    {
        int a=10,b=0;
        try {
            int c=a/b;
            System.out.println("Div is "+c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("First Finally");
        }
    }
    static void second()
    {
        try {
            return;
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Second Finally");
        }
    }
    public static void main(String[] args) {
       first();
       second();
    }   
}
