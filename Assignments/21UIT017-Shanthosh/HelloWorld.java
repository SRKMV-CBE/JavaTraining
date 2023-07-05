class HelloWorld {
    public static void main(String[] args) {
 int n=7,i,modval=0,r;
    for(i=2;i<n;i++)
    { 
        r=n%i;
        if(r==0)
        modval++;
     }
     if(modval==0)
     System.out.println("prime");
     else
     System.out.println("not prime");
    }
}
