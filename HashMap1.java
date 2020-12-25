package hashmap1;
import java.util.*;
import java.util.Map.Entry;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> ob=new HashMap<>();
        ob.put(1,"A");
        ob.put(2,"B");
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
        Set<Entry<Integer,String>> items=ob.entrySet();
        for (Entry<Integer, String> item : items) {
            System.out.println(item);
        }      
    }    
}
