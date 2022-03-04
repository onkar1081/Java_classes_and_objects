public class Main
{
	public static void main(String[] args) {
		String s1="FFGGHHI";
		String s2="";
		String s3="";
		String s4="";
		String s5="";
		for(int i=0;i<s1.length();i++){
		    if(i<2){
		        s2=s2+s1.charAt(i);
		    }
		    if(i<4 && i>1){
		        s3=s3+s1.charAt(i);
		    }
		}
		s4=s1.replaceFirst(s3,s2);
		s5=s4.replaceFirst(s2,s3);
		System.out.println(s5);
		
		}
}
