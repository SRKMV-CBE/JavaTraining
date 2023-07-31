class UnionOfArray{
    public static void main(String args[]){
        int[] a={1,2,3,4,5};
        int[] b={1,2,3,6,9};
        int m=a.length,n=b.length,count=0;
        System.out.println("The Len Is A : "+m);
        System.out.println("The Len Is B : "+n);
        int[] c=new int[m+n];
        for(int i=0;i<m;i++){
            c[i]=a[i];
            count++;
        }
        for(int i=0;i<n;i++){
            if(b[i]==a[i])
            count=count;
            else{
            c[i + m]=b[i];
            count++;
            }
        }
        for(int i=0;i<c.length;i++){
            System.out.println("Joined Array : "+c[i]);
        }
        System.out.println("Count : "+count);
    }
}