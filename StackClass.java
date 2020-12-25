package stackclass;
import java.util.*;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> ob=new Stack<>();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.push(50);
        System.out.println(ob.pop());
        System.out.println(ob.peek());
        System.out.println(ob);
        while(!ob.isEmpty()){
            System.out.println("Poped item is "+ob.pop());
        }
    }    
}
