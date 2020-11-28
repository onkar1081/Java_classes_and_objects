package prioritytothreads;
class Test implements Runnable{
    Thread t;
    int x;
    Test(int a,int p){
    x=a;
    t=new Thread(this);
    t.start();    
}
    @Override
    public void run() {
        for(int i=0;i<=150;i++){
            System.out.println("Table of "+x+" "+(x*i));
        }
    }
}
public class PriorityToThreads {
    public static void main(String[] args) {
      Test t1=new Test(2,Thread.MIN_PRIORITY);
      Test t2=new Test(5,Thread.NORM_PRIORITY);
      Test t3=new Test(8,Thread.MAX_PRIORITY);     
    }  
}
