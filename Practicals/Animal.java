package corejava;
//Adding abstract keyword before Class Name
public abstract class Animal 
{	//Creating variable age
	protected int age;
	
	//Creating parameterized constructor
	public Animal(int age) 
	{
	super();
	this.age = age;
	}
	//Creating getter method
	public int getAge() {
		return age;
	}
}
//Creating a Class Dog which is a SubClass of Class Animal
class Dog extends Animal
{

	public Dog(int age) {
		super(age);	
	}
	//Create toString
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}	
}
//Creating Class Cat which is a subClass of Class Animal
class Cat extends Animal{
	//Creating constructor
	public Cat(int age) {
		super(age);
		
	}
	//Creating toString

	@Override
	public String toString() {
		return "Cat [age=" + age + "]";
	}
	
}
//Creating main class
class TestAnimal
{
	public static void main(String[] agrs)
	{
		//Creating Objects
		Dog d=new Dog(3);
		Cat c=new Cat(4);
		//Printing the values
		System.out.println(d.toString());
		System.out.println(c.toString());
		
	}
}
