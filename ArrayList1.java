package arraylist1;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
       ArrayList ob=new ArrayList();
       System.out.println(ob.size());
       ob.add("A");
       ob.add("B");
       ob.add("C");
       ob.add(10);
       System.out.println(ob.size());
       ob.remove("A");
       ob.remove("C");
       System.out.println(ob.size());
       System.out.println(ob.contains("A"));
       System.out.println(ob.contains("B"));
    }   
}
