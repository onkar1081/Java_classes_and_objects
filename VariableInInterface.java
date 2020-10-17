package variableininterface;
interface A{
    int X=100;
    static int Y=200;
    final int Z=300;
    static final int W=400;  
}
public class VariableInInterface {
    public static void main(String[] args) {
        System.out.println(A.X);
        System.out.println(A.Y);
        System.out.println(A.Z);
        System.out.println(A.W);
    } 
}
