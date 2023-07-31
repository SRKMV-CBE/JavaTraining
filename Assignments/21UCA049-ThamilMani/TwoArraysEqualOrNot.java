class TwoArraysEqualOrNot{
    public static void main(String args[]){
        int[] a=new int[]{1,2,5,4,0};
        int[] b=new int[]{2,4,5,0,1};
        int n=a.length,c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j])
                    System.out.println(a[i]+"Is Available In Both");
            }
        }
    }
}