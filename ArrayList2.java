package arraylist2;
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> ob=new ArrayList<>();
        System.out.println(ob.size());
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        System.out.println(ob.size());
        ob.add("E");
        ob.add(1,"x");
        System.out.println(ob.size());
        System.out.println(ob.get(0));
        System.out.println(ob.get(5));
        System.out.println("===========for loop===============");
        for(int i=0;i<ob.size();i++){
            System.out.println(ob.get(i));
        }
        System.out.println("===========for each===============");
        for (String s1 : ob) {
            System.out.println(s1);
        }
        ob.remove("B");
        ob.remove("D");
        System.out.println("===========iterator===============");
        Iterator<String> it=ob.iterator();
        while(it.hasNext()){
            String n=it.next();
            System.out.println(n);
        }
        ob.clear();
        System.out.println("Cleared");
        for (String s2 : ob) {
            System.out.println(s2);
        }
        ob.add("a");
        ob.add("b");
        ob.add("c");
        System.out.println("Object Array");
        Object [] arr=ob.toArray();
        for(Object ob1:arr){
            System.out.println(ob1);
        }
        System.out.println("String Array");
        String [] arr1=new String[ob.size()];
        ob.toArray(arr1);
        for (String s3 : arr1) {
            System.out.println(s3);
        }
        System.out.println("New String Array");
        String [] arr3 =new String[2];
        arr3=ob.toArray(arr3);
        for (String s4 : arr3) {
            System.out.println(s4);
        }
    }       
}
