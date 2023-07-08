class Animal{
	String name;
	Animal(String name){
		System.out.println(name+" Is Animal...");
	}
	public void run(){
		System.out.println(name+"Is Running ...");
	}
	public void eat(){
		System.out.println(name+"Is Eating...");
	}
}
class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	public void protect(){
		System.out.println("Dog Is Protected Home Every Day...");
	}
}
class cat extends Animal{
	cat(String name){
		super(name);
		System.out.println("It Is Cat...");
	}
	public void noice(){
		System.out.println("Meeyve..");
	}
}
class EgForInheritance{
	public static void main(String args[]){
		cat c=new cat("cat");
		c.noice();
		
		Dog d=new Dog("dog");
		d.protect();
		d.run();
		
		Animal a=new Animal("Common ");
		a.run();
		a.eat();
	}
}
