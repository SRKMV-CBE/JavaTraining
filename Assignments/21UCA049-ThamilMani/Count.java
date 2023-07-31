class Count{
    public static void main(String args[]){
        int a[]=new int[]{5,8};
        int count=0,i=0;
        int n=a.length;
        while(i<n){
            count++;
            int diff=a[i];
            diff=diff-3;
            count++;
            if(diff<=3){
                count++;
                i++;
            }
            else{
                diff=diff-3;
                count++;
                i++;
            }
        }
        System.out.println("No Is : "+count);
    }
}