package dictionaryclass;
import java.util.*;
public class DictionaryClass {
    public static void main(String[] args) {
        Hashtable<Integer,String> d1=new Hashtable<>();
        d1.put(1,"A");
        d1.put(25,"B");
        d1.put(3,"C");
        d1.put(10,"D");
        d1.put(5,"A");
        System.out.println(d1);
        Enumeration<Integer> ob=d1.keys();
        while (ob.hasMoreElements()) {
            Integer n = ob.nextElement();
            System.out.println(n);
        }
        Collection<String> values=d1.values();
        for (String value : values) {
            System.out.println(value);
        }
        d1.remove("D");
        System.out.println(d1);
    }       
}    