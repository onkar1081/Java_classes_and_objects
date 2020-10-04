package pkgstatic.method;
class Test {
    int i;
    static int j;
    Test() {
        i++;
        j++;
    }
    static void add()
    {
        System.out.println("Hello");
    }
    static void show() {
        //System.out.println(i);
        System.out.println(j);
        add();
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        Test.show();
    }
}
