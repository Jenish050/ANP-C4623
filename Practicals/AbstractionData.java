package corejava;

 public class AbstractionData extends AbstractionExample
{
	private double salary;

	public AbstractionData(int id, String name, String address, double salary) 
	{
		super(id, name, address);
		this.salary = salary;
	}
	public void mailCheck ()	
	{
	 System.out.println("Mailing Check to:"+getName());
	}
	
}
