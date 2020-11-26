package demosychronizedkeyword;
class Share{
    synchronized void show(String s1){
        try{
            System.out.print("["+s1);
            Thread.sleep(1500);
        }catch(Exception e){
        }
        System.out.println("]");
    }
}
class Test implements Runnable{
    Thread t;
    Share ob;
    String msg;
    Test(String n,Share ob1){
        t=new Thread(this);
        ob=ob1;
        msg=n;
        t.start();
    }
    @Override
    public void run() {
        ob.show(msg);
    }
}
public class DemoSychronizedKeyword {
    public static void main(String[] args) {
        Share ob=new Share();
        Test t1=new Test("A",ob);
        Test t2=new Test("B",ob);
        Test t3=new Test("C",ob);
    }    
}
