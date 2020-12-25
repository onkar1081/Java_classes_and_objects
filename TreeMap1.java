package treemap1;
import java.util.*;
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> ob=new TreeMap<>();
        ob.put(1,"A");
        ob.put(6,"B");
        ob.put(3,"C");
        ob.put(1,"D");
        ob.put(4,"B");
        ob.put(5,"E");
        System.out.println(ob);
        System.out.println("Keys..........");
        Set<Integer> keys=ob.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        System.out.println("Values.........");
        Collection<String> values=ob.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("Items..........");
        Set<Map.Entry<Integer,String>> items=ob.entrySet();
        for (Map.Entry<Integer, String> item : items) {
            System.out.println(item);
        }            
    }  
}
