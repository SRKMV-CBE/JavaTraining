public class DecimalToBinary
 {
    public static void main(String[]args)
 {
        int num = 14, tmp;
        tmp = num;
        String binary = "";
        while (num >= 2) {
            binary = num % 2 + binary;
            num = num / 2;
        }
        binary = num + binary;
        System.out.println("Binary of " + tmp + "is" + binary);
    }
}