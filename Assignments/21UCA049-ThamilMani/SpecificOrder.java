class SpecificOrder{
    public static void main(String args[]){
        int[] arr=new int[]{1, 2, 3, 5, 4, 7, 10};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
            System.out.println("Even Is : "+arr[i]);
            else
            System.out.println("Odd Is : "+arr[i]);
        }
    }
}
