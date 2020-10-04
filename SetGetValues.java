package setgetvalues;
class Dog{
    String breed,color,temp;
    void setdata(String a,String b,String c)
    {
        breed=a;
        color=b;
        temp=c;      
    }
    void getdata()
    {
        System.out.println(breed+","+color+","+temp+",");
    }    
}
public class SetGetValues {
    public static void main(String[] args) {
        Dog ob1=new Dog();
        Dog ob2=new Dog();
        ob1.setdata("Indian", "brown", "aggresive");
        ob2.setdata("Labrador", "white", "soft");
        ob1.getdata();
        ob2.getdata();
    }    
}
