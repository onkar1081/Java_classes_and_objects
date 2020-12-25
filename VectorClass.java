package vectorclass;
import java.util.*;
public class VectorClass {
    public static void main(String[] args) {
        Vector<String> ob=new Vector<>();
        System.out.println(ob.size());
        ob.addElement("A");
        ob.addElement("B");
        ob.addElement("C");
        ob.addElement("D");
        ob.addElement("E");
        ob.addElement("F");
        System.out.println(ob.size());
        System.out.println(ob);
        System.out.println("Using Enumeration.......");
        Enumeration<String> it=ob.elements();
        while (it.hasMoreElements()) {
            String n = it.nextElement();
            System.out.println(n);
        }
        System.out.println("Using Iterator.......");
        Iterator<String> it1=ob.iterator();
        while (it1.hasNext()) {
            String n1 = it1.next();
            System.out.println(n1);
        }
        ob.remove("C");
        System.out.println(ob);
        System.out.println(ob.indexOf("D"));
        System.out.println(ob.indexOf("Z"));
    }   
}
