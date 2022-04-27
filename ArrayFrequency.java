public class Main
{
	public static void main(String[] args) {
	   int arr[]={10,30,10,45,30,20,10};
	   Arrays.sort(arr);
	   ArrayList <Integer>list=new ArrayList<>();
	   int count=0,temp=0;
	   for(int i=0;i<arr.length;i++){
	       count=0;
	      for(int j=0;j<arr.length;j++){
	          if(arr[i]==arr[j]){
	              count++;
	          }
	      }
	      if(arr[i]!=temp){
	          	     System.out.println(arr[i]+" "+count);
	          	     temp=arr[i];
	      }

	   }
	}
}
