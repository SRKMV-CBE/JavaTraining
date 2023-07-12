import java.util.Scanner;
class NumConversion
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Decimal to Binary,Octal And HexaDecimal Conversion");
       String binary,octal,hexadecimal;
       
        System.out.print("Enter a Decimal Number:");
         
        int number = s.nextInt();

        DecimalToBinaryConvert Binary = new DecimalToBinaryConvert();
            binary = Binary.ConvertToBinary(number);
            System.out.println("Binary Format of " + number + " is : " + binary);
        DecimalToOctalConvert Octal = new DecimalToOctalConvert();
            octal=Octal.ConvertToOctal(number);
            System.out.println("Octal Format of " + number + " is : " + octal);
        DecimalToHexaConvert Hexa = new DecimalToHexaConvert();
            hexadecimal = Hexa.convertToHexa(number);
            System.out.println("HexaDecimal Format of " + number + " is : " + hexadecimal);
    }
}























       
       


























       /* String binary=convertToBinary(number);
        System.out.println("Binary Format of "+number+" is :"+binary);

        String octal=convertToOctal(number);
        System.out.println(" Octal Format of "+number+" is :"+octal);

        String hexadecimal=convertToHexaDecimal(number);
        System.out.println(" HexaDecimal Format of "+number+" is :"+hexadecimal);*/