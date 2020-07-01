package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{
	private String schoolName;

	public Student(String firstName, String secondName, int age,String schoolName) {
		super(firstName, secondName, age);
		this.schoolName = schoolName;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String introduce() {
		String text = "I am study in university" + schoolName;
		System.out.println(text);
		
		return text;
	}
	//"I am study in university <schoolName>"
}









