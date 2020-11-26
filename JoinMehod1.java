package joinmehod1;
class Test implements Runnable{
    Thread t;
    Test(String n){
        t=new Thread(this);
        t.setName(n);
        t.start();
    }
    @Override
    public void run() {
        int i;
        try {
            for(i=0;i<5;i++){
                System.out.println("Child thread "+t.getName()+" "+ i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
      }
    }
}
public class JoinMehod1 {
    public static void main(String[] args) {
       Test t1=new Test("A");
       Test t2=new Test("B");
       Test t3=new Test("C");
        int i;
        System.out.println("Before");
        try {
         t1.t.join();
         t2.t.join();
         t3.t.join();
        } catch (Exception e) {
      } 
        System.out.println("After");           
    }   
}
