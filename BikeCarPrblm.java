import java.util.;
import java.io.;
public class Main
{
	public static void main(String[] args) {
	    try{
	     	Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    for(int i=0;in;i++){
		       Main2 ob=new Main2();
		       int x=s.nextInt();
		       String s1=ob.tyre(x);
		       System.out.println(s1);
	}
  }catch(Exception e ){
      System.out.println(Exception Occured);
  }
}
}
class Main2{
    public String tyre(int y){
       String s2=;
       if(y%4==0){
           s2=NO;
       }else{
           s2=YES;
       }
       return s2;
    }
}
