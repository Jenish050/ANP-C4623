package corejava;

public class TestEncapsulation 
{

	public static void main(String[] args) 
	{
		//Creating Object of Class EncapsulatinExample
		EncapsulationExample a=new EncapsulationExample();
		//object is used to access the methods of a class
		a.setId(1);
		a.setName("Jenish");
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName());    
		
	}

}
