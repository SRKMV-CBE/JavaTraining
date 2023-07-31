class MinMaxArray{
    public static void main(String args[]){
        int[] a=new int[]{7, 345, 234, 21, 56789};
        int min=a[0],max=a[0];
        int n=a.length;
        for(int i=1;i<n;i++){
            if(min>a[i])
            min=a[i];
            if(max<a[i])
            max=a[i];
        }
        System.out.println("The Minimum Value In The Array : "+min);
        System.out.println("The Maximum Value In The ArraY : "+max);
    }
}