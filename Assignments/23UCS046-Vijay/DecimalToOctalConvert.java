import java.util.*;

public class DecimalToOctalConvert {

    public static void main(String... args)
    {
        Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the Number: ");
    int number = s.nextInt();

    String OctalNum = ConvertToOctal(number);
    System.out.println("Binary of " + number + " is "  + OctalNum);
    }

    public static String ConvertToOctal(int number)
    {

    StringBuilder octal=new StringBuilder();
        int rem=0;
        while(number > 0)
        {
            rem=number % 8;
            octal.insert(0,rem);
            number=number/8;
        }
        return octal.toString();
    }
}
