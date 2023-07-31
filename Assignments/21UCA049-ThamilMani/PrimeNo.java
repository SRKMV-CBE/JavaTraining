import java.util.Scanner;
class PrimeNo{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Number Is : ");
        int num=input.nextInt();
        int c=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                c=1;
                break;
            }
        }
        if(c==0)
        System.out.println(num+" Is Prime No ");
        else
        System.out.println(num+" Is Not A Prime No");
    }
}