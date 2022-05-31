import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={10,20,30,10,40,30,50,60,60,20};
	    Arrays.sort(arr);
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    for(int x:arr){
	        if(!list.contains(x)){
	            list.add(x);
	        }
	    }
	    for(int y:list){
	        System.out.println(y);
	    }
	}
}
