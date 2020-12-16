package generics1;
class Test<T>{
    T i;
    Test(T x){
        i=x;       
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class Generics1 {
    public static void main(String[] args) {
        Test<String> t1=new Test<>("Hello");
        t1.show();
        Test<Integer> t2=new Test<>(100);
        t2.show();
    } 
}
