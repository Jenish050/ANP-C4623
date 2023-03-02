package corejava;

class Animal 
{
//This is a parent class
//method
	public void display()
	{
		System.out.println("Inside parent class");
	}
}
//Child Class
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Barks...");
	}
}
class puppy extends Dog
{
	public void run()
	{
		System.out.println("Runs by small steps....");
	}
}
class Tester{
	public static void main(String[] args)
	{
		puppy d=new puppy(); //Creating Object of Child class 
		d.display();
		d.sound();
		d.run();	
	}
}
