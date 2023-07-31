class Frequency{
    public static void main(String args[]){
        int[] a=new int[]{3,3,3,3};
        int n=a.length;
        int count=0;
        for(int i=1;i<=n;i++){  //No.of.Occur
            for(int j=0;j<n;j++){ //check
                if(a[j]==i)
                count++; 
            }
            System.out.println("I Value Is : "+i+" Count : "+count);
            count=0;
        }
       // System.out.println("count : "+count);
    }
}