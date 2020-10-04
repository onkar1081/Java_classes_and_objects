package addtwonum;
class test{
    int i,j;
    void setij(int x,int y)
    {
      i=x;
      j=y;
    }
    void showdata()
    {
        System.out.println(i+j);
    }
}
public class Addtwonum {
    public static void main(String[] args) {
        test t1=new test();
        test t2=new test();
        t1.setij(10,20);
        t2.setij(30,40);
        t1.showdata();
        t2.showdata();
    }    
}
