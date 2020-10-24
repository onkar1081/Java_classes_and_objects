package pkgfinally;
public class Finally {
    public static void main(String[] args) {
       int a=7,b=0,c;
        try {
            c=a/b;
            System.out.println("Division is "+c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Always Excecuted");
        }
    }  
}
