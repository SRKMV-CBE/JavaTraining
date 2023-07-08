abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public void protect() {
        System.out.println(name + " is protecting");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void protect() {
          System.out.println("Protecting..");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Dog("Buddy");
        Dog animal  = new Dog("Buddy");
        animal.makeSound();
        animal.eat();
	animal.protect();

        Cat cat = new Cat("Whiskers");
        //animal = new Cat("Whiskers");
       	cat.makeSound();
        cat.eat();
   	cat.protect(); 
   }
}

