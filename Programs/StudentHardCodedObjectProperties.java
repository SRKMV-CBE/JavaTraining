public class StudentHardCodedObjectProperties
{
	public static void main(String... args)
	{
		Student s1 = new Student();
		s1.name =  "Yogesh";
		s1.age = 19;

		System.out.println("Student Name :  " + s1.name);
		System.out.println("Student Age :  " + s1.age);
		
		Student s2 = new Student();
		s2.name =  "Ragesh";
		s2.age = 20;

		System.out.println("Student Name :  " + s2.name);
		System.out.println("Student Age :  " + s2.age);
	}
}
