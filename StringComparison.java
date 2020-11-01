package stringcomparison;
public class StringComparison {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2="hello";
        if(s1.equals(s2))
        {
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }      
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }     
    }    
}
