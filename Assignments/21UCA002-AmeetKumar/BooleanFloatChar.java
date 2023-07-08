import java.util.Scanner;
public class BooleanFloatChar
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true or false): ");
        boolean boolValue = scanner.nextBoolean();

        System.out.print("Enter a floating-point value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        System.out.println("Boolean value: " + boolValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Character value: " + charValue);
    }
}
