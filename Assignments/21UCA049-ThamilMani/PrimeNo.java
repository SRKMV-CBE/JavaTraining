class PrimeNo{
    public static void main(String args[]){
        int n=23,c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c=0;
                break;
            }
            else
            c=1;
        }
        if(c==1)
        System.out.println(n+" Is A Prime Number...");
        else
        System.out.println(n+" Is Not A Prime Numbers...");
    }    
}
