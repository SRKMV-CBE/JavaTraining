class KeyPair{
    public static void main(String args[]){
        int[] a=new int[]{1,2,4,3,6};
        int n=a.length,x=10;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++){
                int sum=a[i]+a[j];
                if(sum==x)
                    System.out.println("The Sum Value Is Equal To The Pos : "+i+" "+j+" The Result Is : "+sum);
            }
        }
    }
}