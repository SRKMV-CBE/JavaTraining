import java.util.Scanner;

public class StudentDetails
{
    public static void main(String[] args)
    {
        Scanner student = new Scanner(System.in);
        String[] names = new String[10];
        int[] ages = new int[10];

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Enter the name of student " + ( i ) + ":");
            names[i] = student.nextLine();

            System.out.println("Enter the age of student " + ( i ) + ":");
            ages[i] = student.nextInt();
            student.nextLine();
        }

        System.out.println("List of students:");
	System.out.println(" ");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Student " + ( i ) + ":");
            System.out.println("Name: " + names[ i ]);
            System.out.println("Age: " + ages[ i ]);
           System.out.println(" ");

        }
    }
}

