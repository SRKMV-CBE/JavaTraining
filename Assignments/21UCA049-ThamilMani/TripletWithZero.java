class TripletWithZero{
    public static void main(String args[]){
        int[] a=new int[]{0, -1, 2, -3, 1};
        int n=a.length;
        int sum,c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    sum=a[i]+a[j]+a[k];
                    if(sum==0){
                        c=1;
                        break;
                    }
                }
            }
        }
        if(c==1)
        System.out.println("Triple");
        else
        System.out.println("Not Triple");
    }
}