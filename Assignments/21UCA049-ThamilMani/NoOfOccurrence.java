class NoOfOccurrence{
    public static void main(String args[]){
        int a[]=new int[]{1,1,2,2,2,2,3};
        int n=a.length,x=2,count=0;
        for(int i=0;i<n;i++){
            if(a[i]==x)
            count++;
        }
        System.out.println("The Number "+x+" Is Available In The Array Has : "+count);
    }
}