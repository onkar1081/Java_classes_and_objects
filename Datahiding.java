package datahiding;
class Student{
    private int id;
    private String name;
    void setdata(int a,String b)   
    {
        if(a<0)
        {
            System.out.println("Please enter valid data");
        }
        else{
            id=a;
            name=b; 
        }
    }
    void showdata()
    {
        System.out.println(id);
        System.out.println(name);
    }
}
public class Datahiding {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setdata(-100,"#1233");
    }   
}
