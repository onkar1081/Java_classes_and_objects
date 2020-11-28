package newclassmultithreading;
class Share {
    int x;
    boolean flag = true;
    synchronized void put(int a) {
        try {
            if (flag == true) {
                x = a;
                System.out.println("Put " + x);
                flag=false;
                notify();
                wait();
            } else {
                wait();
            }
        } catch (Exception e) {
        }
    }
    synchronized void get() {
        try {
            if (flag == false) {
                System.out.println("Got " + x);
                flag=true;
                notify();
                wait();
            } else {
                wait();
            }
        } catch (Exception e) {
        }
    }
}
class Producer implements Runnable {
    Thread t;
    Share ob;
    public Producer(Share ob1) {
        t = new Thread(this);
        ob = ob1;
        t.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            ob.put(i);
            i++;
        }
    }
}
class Consumer implements Runnable {
    Thread t;
    Share ob;
    public Consumer(Share ob1) {
        t = new Thread(this);
        ob = ob1;
        t.start();
    }
    @Override
    public void run() {
        while (true) {
            ob.get();
        }
    }
}
public class NewClassMultithreading {
    public static void main(String[] args) {
        Share ob = new Share();
        Producer p = new Producer(ob);
        Consumer c = new Consumer(ob);
    }
}

