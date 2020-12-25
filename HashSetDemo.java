package hashsetdemo;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> ob=new HashSet<>();
        System.out.println(ob.size());
        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add(20);
        System.out.println(ob.size());
        System.out.println(ob);    
    }
}
