import java.util.*;
class Solution {
    public String interpret(String command) {
        String s1=command.replace("()","o");
       s1=s1.replace("(al)","al");
        return s1;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution ob=new Solution();
		System.out.println(ob.interpret("G()(al)"));
	}
}
