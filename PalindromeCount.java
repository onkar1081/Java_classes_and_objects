public class Main
{
	public static void main(String[] args) {
		String s1="I am level 71";
		String []arr=s1.split(" ");
		String s2="";
		int count=0;
		for(String s3:arr){
		    s2="";
		    for(int i=s3.length()-1;i>=0;i--){
		        s2=s2+s3.charAt(i);
		    }
		    System.out.println(s2);
		    if(s2.equals(s3)){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
