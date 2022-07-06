import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s1="The four boxing wizard starts over the quickly";
	    s1=s1.toLowerCase();
	    s1=s1.replaceAll(" ","");
	    String s2="";
	    for(int i=97;i<123;i++){
	        if(!s1.contains((char)i+"") ){
	           s2=s2+(char)i;
	        }
	    }
	    System.out.print(s2);
	    if(s2.length()==0){
	        System.out.println("0");
	    }
	}
}
