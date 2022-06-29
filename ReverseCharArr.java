import java.util.*;
public class Main {
    public static void main(String [] args) {   
        char[] s={'h','e','l','l','o'};
        char[] arr=new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
             arr[j]=s[i];
             j++;
        }
        for(int i=0;i<s.length;i++){
            s[i]=arr[i];
        }
        System.out.println(Arrays.toString(s));
    }
}
