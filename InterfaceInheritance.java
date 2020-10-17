package interfaceinheritance;
interface A{
    void add(int x,int y);
}
interface B extends A{
    void sub(int x,int y);
}
class Test implements B{
    @Override
    public void sub(int x, int y) {
        System.out.println(x+y);
    }
    @Override
    public void add(int x, int y) {
        System.out.println(x-y);
    }  
}
public class InterfaceInheritance {
    public static void main(String[] args) {
       Test ob =new Test();
       ob.add(60,20);
       ob.sub(40,10);
    }   
}
