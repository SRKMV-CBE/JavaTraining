class RearrangeArray{
    public static void main(String args[]){
        int[] a=new int[]{1,2,3,4,5,6};
        int n=a.length,j=a.length-1,large,small;
        for(int i=0;i<=n;i++){
         large=a[j];
         System.out.print(large+" ");
         large=a[j-1];
         small=a[i];
         System.out.print(small+" ");
         small=a[i+1];
        }
    }
}
