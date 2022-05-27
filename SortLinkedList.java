import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		list1.add(10);
		list1.add(100);
		list1.add(50);
		list1.add(30);
		list1.add(15);
		Collections.sort(list1);
		ListIterator list_Iter = list1.listIterator();
        System.out.println("The list is as follows:");
        while(list_Iter.hasNext()){
           System.out.println(list_Iter.next());
        }
        System.out.println(list1);
	}
}
