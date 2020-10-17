package pkginterface;
interface A{
    void add(int x,int y);
    abstract void sub(int x,int y);
}
class B implements A{
    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }
    @Override
    public void sub(int x, int y) {
        System.out.println(x-y);
    }  
}
public class Interface {
    public static void main(String[] args) {
        B ob=new B();
        ob.add(70,50);
        ob.sub(100,40);
    }   
}
