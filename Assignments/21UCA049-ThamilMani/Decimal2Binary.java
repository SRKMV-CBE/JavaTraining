
import java.util.Scanner;
class Decimal2Binary{
    public static void decimaltobinary(int n){
        int[] arr=new int[100];
        int i=0;
        while(n>=1){
            arr[i++]=n%2;
            n=n/2;
        }
        System.out.print("The Binary Number Is :");
        for(int j=i-1;j>=0;j--)
        System.out.print(arr[j]);
        System.out.println();
    }
    public static void decimaltooctal(int n){
        int[] arr=new int[14];
        int i=0;
        while(n>=1){
            arr[i++]=n%8;
            n=n/8;
        }
        System.out.print("The Octal Number Is :");
        for(int j=i-1;j>=0;j--)
        System.out.print(arr[j]);
        System.out.println();
    }
    
    public static void decimaltohex(int n){
        char[] arr=new char[14];
        int i=0,temp;
        while(n>=1){
            temp=n%16;
            if(temp<10)
            temp+=48;
            else
            temp+=55;
            arr[i++]=(char)temp;
            n=n/16;
        }
        System.out.print("The Hexadecimal Number Is :");
        for(int j=i-1;j>=0;j--)
        System.out.print(arr[j]);
        System.out.println();
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Decimal Value : ");
        int n=s.nextInt();
        convertion.decimaltobinary(n);
        convertion.decimaltooctal(n);
        convertion.decimaltohex(n);
    }
}
