package constructor;
class Test{
        int i,j;
        Test()
        {
            i=10;
            j=20;
            System.out.println("Constructor called");
        }
        void add()
        {
            System.out.println(i+j);
        }       
}       
public class Constructor {
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        t1.add();
        t2.add();
        t3.add();
    }
}


