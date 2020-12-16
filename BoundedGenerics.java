package boundedgenerics;
class Test <T extends Number>{
    T i;
    Test(T x){
        i=x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class BoundedGenerics {
    public static void main(String[] args) {
        Test<Integer> t1=new Test<>(100);
        t1.show();
    }   
}
