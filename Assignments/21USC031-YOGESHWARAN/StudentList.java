import java.util.*;
public class StudentList
{	
	public static void main(String... args)
	{
		Scanner scan=new Scanner(System.in);
		String[] name=new String[11];
		int[] age=new int[11];
		
		System.out.println("\nEnter Student List in 10 Students");
		for(int i=1;i<=10;i++)
		{
			System.out.println("\nEnter Student Name:"+(i));
 			name[i]=scan.nextLine();
   
			System.out.println("Enter Student Age:"+(i));
			age[i]=scan.nextInt();
			scan.nextLine();
		}
			System.out.println("\nStudents Details :");
			for(int i=1;i<=10;i++)
			{
				System.out.println((i)+"\nName :"+name[i]);
				System.out.println("Age :"+age[i]);
			}
			int eldestIndex=0;
			int youngestIndex=0;

			for(int i=1;i<10;i++)
			{
				if(age[i]>age[eldestIndex])
				{
					eldestIndex=i;
				}

				if(age[i]>age[youngestIndex])
				{
					youngestIndex=i;
				}

                                System.out.println("\nEldest Students");
				System.out.println("Name :"+name[eldestIndex]+"/ Age :"+age[eldestIndex]);

				System.out.println("\nYoungest Students");
				System.out.println("Name :"+name[youngestIndex]+"/ Age :"+age[youngestIndex]);
			}

		
	}
}
