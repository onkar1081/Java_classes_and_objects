package nestedclass1;
class Outer{
   private String msg="Hello World";
   void disp(){
       System.out.println("In outer");
   }
   class Inner{
       void show(){
           System.out.println("In inner");
           System.out.println(msg);
       }
   }
}
public class NestedClass1 {
    public static void main(String[] args) {
      Outer ob=new Outer();
      ob.disp();
      Outer.Inner ob1=ob.new Inner();
      ob1.show();
    }    
}
