package methodininterface;
interface A{
    static void show()
    {
        System.out.println("In Interface");
    }
    void add(int x,int y);
}
class Test implements A{
    @Override
    public void add(int x, int y) {
         System.out.println(x+y);  
    }
}
public class MethodInInterface {
    public static void main(String[] args) {
       A.show();
       Test t1=new Test();
       t1.add(10,40);
    }  
}
