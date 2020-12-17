package autoboxingandunboxing;
public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
       int x=100;
       Integer ob=new Integer(x);
       System.out.println(ob.intValue());
       Integer ob1=x;
       System.out.println(ob1.intValue());
       Double ob2=3.14;
       System.out.println(ob2.doubleValue());
       int a;
       a=ob1;
       System.out.println(a);
       double b;
       b=ob2;
       System.out.println(b);      
    }
    
}
