class CyclicallyRotate{
    public static void main(String args[]){
        int[] a=new int[]{1, 2, 3, 4, 5};
        int n=a.length;
        int x=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
            a[0]=x;
        }
        for(int i=0;i<n;i++)
        System.out.println(a[i]+" ");
    }
}
/*
tatic void rotate()
    {
       int x = arr[arr.length-1], i;
       for (i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }*/