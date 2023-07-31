class LeftRotation{
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6};
        int n=a.length,k=12;
        System.out.println("The Original Array Is : ");
        for(int b=0;b<n;b++)
        System.out.print(a[b]+" ");
        for(int i=0;i<k;i++){
            int temp=a[0];
            for(int j=0;j<n;j++){
                if(j==n-1){
                    a[j]=temp;
                }
                else{
                a[j]=a[j+1];
            }
            }
            System.out.println("  ");  
        }
        System.out.println("The Rotation Value Is : "+k);
        System.out.println();
        System.out.println("The Left Rotation Array is : ");
        for(int m=0;m<n;m++){
            System.out.print(a[m]+" ");
        }
    }
}