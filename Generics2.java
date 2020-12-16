package generics2;
class Test<T,V>{
    T i;
    V j;
    Test(T x,V y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());        
    }
}
public class Generics2 {
    public static void main(String[] args) {
        Test<String,Integer> t1=new Test<>("Hello",10);
        t1.show();
    }   
}
