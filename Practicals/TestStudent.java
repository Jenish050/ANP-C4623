package corejava;

public class TestStudent {

	public static void main(String[] args) {
		//Creating Object of Class StudentData
		StudentData a=new StudentData(); 
		a.setStudentId(1);
		a.setStudentName("Jenish");
		a.setAge(21);
		System.out.println("Student Id:"+a.getStudentId()+"\n"+"Student Name:"+a.getStudentName()+"\n"+"Student Age:"+a.getAge());
		

	}

}
