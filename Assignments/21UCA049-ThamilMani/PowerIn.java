class PowerIn{
   long n=1099511627776;
        int c=0;
        for(int i=0;i<n/2;i++){
            double x=Math.pow(2,i);
            if(x==n){
                System.out.println("Math Of 2 Is : "+x+" In "+i);
                c=1;
            }
        }
        if(c==1)
        System.out.println("Available");
        else
        System.out.println("Not Available ");
}
   
