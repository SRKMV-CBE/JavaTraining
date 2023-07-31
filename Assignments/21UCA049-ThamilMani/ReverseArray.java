class ReverseArray{
    public static void main(String args[]){
        int[] a=new int[]{5,6,8,9};
        int n=a.length,k=3,h=k,g=n;
        int[] b=new int[n];

        for(int y=0;y<n;y++)
        System.out.println("Original Array : "+a[y]);

        for(int i=0;i<k;i++)
        b[i]=a[--h];

        for(int j=k;j<n;j++)
        b[j]=a[--g];
        
        for(int m=0;m<n;m++)
        System.out.println("Reverse Array Is : "+b[m]);
    }
}