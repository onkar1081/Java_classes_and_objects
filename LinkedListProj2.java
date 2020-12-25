package linkedlistproj2;
import java.util.*;
class Item {
    String name;
    int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class LinkedListProj2 {
    public static void main(String[] args) throws Exception {
        LinkedList<Item> list1 = new LinkedList<>();
        Scanner ob = new Scanner(System.in);
        System.out.println("Select Choice:(insert,print,remove)");
        while (true) {
            System.out.println("Enter Your Choice:");
            String choice = ob.nextLine();
            if (choice.startsWith("stop")) {
                break;
            } else if (choice.startsWith("insert")) {
                String[] arr = choice.split(" ");
                Item item = new Item();
                int age = Integer.parseInt(arr[2]);
                item.setAge(age);
                item.setName(arr[1]);
                list1.add(item);
            } else if (choice.startsWith("remove")) {
                String[] arr = choice.split(" ");
                int age = Integer.parseInt(arr[1]);
                for (int i = 0; i < list1.size(); i++) {
                    Item item = list1.get(i);
                    if (item.getAge() == age) {
                        list1.remove(i);
                        break;
                    }
                }
            } else if (choice.startsWith("print")) {
                for (Item item : list1) {
                    System.out.println(item.getName() + " " + item.getAge());
                }
            }
        }
    }
}
