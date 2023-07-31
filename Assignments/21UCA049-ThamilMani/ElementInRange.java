class ElementInRange{
    public static void main(String args[]){   
        int n=7,a=2,b=6;
        int arr[]=new int[]{1,4,5,2,7,8,3};
        //boolean val;
        for(int i=a;i<=b;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i)
                System.out.println(i);
            }
        }
    }
}