import java.util.*;

public class DecimalToHexaConvert {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = s.nextInt();

        String hexadecimal = convertToHexa(number);
        System.out.println("Hexadecimal of " + number + " is " + hexadecimal);
    }

    public static String convertToHexa(int number) {
        int rem;
        int temp = number;
        StringBuilder hexaDec = new StringBuilder();

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (temp > 0) {
            rem = temp % 16;
            hexaDec.insert(0, hex[rem]);
            temp = temp / 16;
        }
        return hexaDec.toString();
    }
}