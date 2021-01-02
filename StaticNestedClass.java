package staticnestedclass;
class Outer{
    static class Inner{
        static void show(){
            System.out.println("In static nested class....");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner.show();
    }    
}
