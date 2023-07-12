import java.util.*;

public class DecimalToBinaryConvert 
{
    
    public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the Number: ");
    int number = s.nextInt();

    String BinaryNum = ConvertToBinary(number);
    System.out.println("Binary of " + number + " is "  + BinaryNum);
    }



    public static String ConvertToBinary(int number)
    {
        StringBuilder binary = new StringBuilder();
        int rem=0;
        while(number > 0)
        {
            rem=number%2;
            binary.insert(0,rem);
            number=number/2;
        }
        return binary.toString();
    }

}