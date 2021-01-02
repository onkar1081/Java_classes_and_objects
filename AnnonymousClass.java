package annonymousclass;
interface A{
    void add(int x,int y);
}
public class AnnonymousClass {
    public static void main(String[] args) {
        A t1=new A() {
            @Override
            public void add(int x, int y) {
                System.out.println("Addition is "+(x+y));
            }
        };
        t1.add(100, 250);
    }    
}
