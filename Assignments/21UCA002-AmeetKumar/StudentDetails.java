import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        int[] ages = new int[10];

        System.out.println("Enter the name and age of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            names[i] = scanner.nextLine();

            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character
        }

        System.out.println("\nStudent details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }

        int eldestIndex = 0;
        int youngestIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (ages[i] > ages[eldestIndex]) {
                eldestIndex = i;
            }
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        System.out.println("\nEldest student:");
        System.out.println("Name: " + names[eldestIndex] + ", Age: " + ages[eldestIndex]);

        System.out.println("\nYoungest student:");
        System.out.println("Name: " + names[youngestIndex] + ", Age: " + ages[youngestIndex]);
    }
}
