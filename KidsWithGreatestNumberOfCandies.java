class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies){
        ArrayList<Boolean> list=new ArrayList<>();
       ArrayList<Integer> list1=new ArrayList<>();
        for(int x:arr){
            list1.add(x);
        }
        Collections.sort(list1);
        int temp=0;
        int n=arr.length;
        n=n-1;
        int max=list1.get(n);
        for(int i=0;i<arr.length;i++){
            temp=arr[i]+extraCandies;
            System.out.println(temp+" "+max);
            if(temp>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
