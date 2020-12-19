package arraylist3;
import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> ob=new ArrayList<>();
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        ob.add("B");
        ob.add(1,"X");
        System.out.println(ob);
        System.out.println(ob.get(0));
        int index=ob.indexOf("C");
        System.out.println(index);
        System.out.println(ob.lastIndexOf("B"));
        ListIterator<String> it=ob.listIterator();
        System.out.println("Forward..........");
        while(it.hasNext()){
            String n=it.next();
            System.out.println(n);
        }
        System.out.println("Backward..........");
        while(it.hasPrevious()){
            String p=it.previous();
            System.out.println(p);
        }
    }   
}
