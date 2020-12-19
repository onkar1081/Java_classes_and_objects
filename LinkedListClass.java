package linkedlistclass;
import java.util.*;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        list.addFirst("X");
        list.addLast("Z");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
