package corejava;

interface MyInterface 
{	//Creating Method doSomething without body
	public void doSomething();
}
class MyClass implements MyInterface//Creating a class that implements MyInterface
{
	public void doSomething()//Creating Method doSomething with Body
	{
		System.out.println("Doing Something");
	}
}
class TestMyInterface//Main Class
{
	public static void main(String[] agrs)
	{
		MyClass mc=new MyClass();//Creating Object of MyClass
		mc.doSomething();//Calling Method from class MyClass
	}
}
