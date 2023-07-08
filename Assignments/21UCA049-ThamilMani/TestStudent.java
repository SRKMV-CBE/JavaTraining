import java.util.Scanner;
class Student{
	public Scanner keyboard=new Scanner(System.in);
	String name;
	int age;
	public void getvalue(){
		System.out.print("Enter The Student Name : ");
		name=keyboard.nextLine();
		System.out.print("Enter The Student Age : ");
		age=keyboard.nextInt();
	}
	public void setvalue(){
		System.out.println("The Student Name Is "+name);
		System.out.println("The Student Age Is "+age);
	}
}

class TestStudent{
	public static void main(String args[]){
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.getvalue();
		s2.getvalue();
		s3.getvalue();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
	}
}
