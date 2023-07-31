class SearchAnElementArray{
    public static void main(String args[]){
        int[] a=new int[]{1,2,3,4,5};
        int n=a.length,s=5;
        for(int i=0;i<n;i++){
        if(a[i]==s)
        System.out.println(i+" Is Position ");
        }
    }
}