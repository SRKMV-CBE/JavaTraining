class SmallestElement{
    public static void main(String args[]){
        int a[]=new int[]{2,3,6,7};
        int temp1=a[0],temp2=a[1];
        int n=a.length;
        for(int i=1;i<n;i++){
            if(temp1>a[i])
                temp1=a[i];
            if(temp2>a[i])
                temp2=a[i];
        }
        System.out.println("The Smallest Is : "+temp1);
        System.out.println("The Second Smallest Is : "+temp2);
    }
}