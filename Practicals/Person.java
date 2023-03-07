package corejava;

public class Person 
{
	//Creating variables name,age
	private String name;
	private int age;
	//Creating parameterized constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//Creating getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


//Create a Class Student that inherits Class Person
class Student extends Person
{
	private String studenId;
	private String major;
	//Creating parameterized constructor
	public Student(String name, int age, String studenId, String major) {
		super(name, age);
		this.studenId = studenId;
		this.major = major;
	}
	//Create getters and setters
	public String getStudenId() {
		return studenId;
	}
	public void setStudenId(String studenId) {
		this.studenId = studenId;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
//Creating a Class GraduateStudent that inherits Class Student
class GraduateStudent extends Student
{
	private String advisor;
	private String theseisTopic;
	//Creating parameterized constructor
	public GraduateStudent(String name, int age, String studenId, String major, String advisor, String theseisTopic) {
		super(name, age, studenId, major);
		this.advisor = advisor;
		this.theseisTopic = theseisTopic;
	}
	//Creating getters and setters
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public String getTheseisTopic() {
		return theseisTopic;
	}
	public void setTheseisTopic(String theseisTopic) {
		this.theseisTopic = theseisTopic;
	}
}

//Main Class
class TestPerson
{
	public static void main(String[]agrs)
	{
	GraduateStudent g=new GraduateStudent("Jenish",25,"1","IT","Ram","inheritance");
	System.out.println("Name: "+g.getName()+"\n"+"Age: "+g.getAge()+"\n"+"Student Id: "+g.getStudenId()+"\n"+"Major :"+g.getMajor()+"\n"+"Advisor: "+g.getAdvisor()+"\n"+"TheseisTopic: "+g.getTheseisTopic() );
	}
}
