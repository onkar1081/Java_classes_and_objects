package thiskeyword;
class Test{
    int i;
    Test(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
       Test t1=new Test(10);
       t1.show();
    }
}
