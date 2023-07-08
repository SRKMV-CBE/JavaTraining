class Person implements Eatable, Walkable
{
	String name;
	int age;
	
	public void eat(String food)
	{		
		System.out.println(name + " is eating " + food);
	}
	
	public void walk(String target)
	{
		System.out.println(name + " is walking towards the " + target);
	}
}
