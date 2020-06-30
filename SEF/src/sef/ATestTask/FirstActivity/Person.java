package sef.ATestTask.FirstActivity;


public class Person {
	private String firstName;
	private String secondName;
	private int age; 
	
	// 1) in file Person
  // 1.1 Based on code implement Person attributes
  // 1.2 Add method for introduce of person ->
 // "My name is <name> and i am <age> years old"

//TODO 1 Implement Person Attributes

	//Behavior - default constructor
	public Person(){
	
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		try {
			if (firstName.matches(".*\\d.*")) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Name contain number");
		}
		
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "I am " + getFirstName() + " " + getSecondName();
	//	"My name is <name> and i am <age> years old"
	}
	
	public void introduce() {
		System.out.println("My name is " + firstName + " and i am" + age + "years old");
		
	}
	
	
}

