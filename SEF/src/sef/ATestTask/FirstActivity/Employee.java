package sef.ATestTask.FirstActivity;

public class Employee extends Person{

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
    	this.empId = -1;
    	this.jobTitle = "Unknown";
    	this.companyName = "Unknown";
    	this.salary = -1000;
    	
    }

    public Employee(int id, String jobTitle, String companyName, double salary){
        empId = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;       
      
    }
    
    public Employee(String firstName, String secondName, int age){
    	super.setFirstName(firstName);
    	super.setSecondName(secondName);
    	super.setAge(age);
    	
    }
     

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    
    //TODO 2 add getters and setters
	
	//"My name is <name> and i am <age> years old
	  // I am work as <jobTitle> in <company>"
    
    //TODO 3 override method announce()
    @Override 
	public void introduce() {
		System.out.println("My name is " + super.getFirstName() + " and i am" + super.getAge() + "years old");
		System.out.println("I am work as" + jobTitle + "in" + companyName); 
}



}