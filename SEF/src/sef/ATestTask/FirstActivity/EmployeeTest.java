package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;


public class EmployeeTest extends TestCase {
	
    public void testcheckEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Vladimir");
        assertEquals("I am an error message", "Vladimir", employee.getFirstName());
        
        employee.setAge(18);
        assertEquals("I am an error message", 18, employee.getAge());
        
        
        
    }
    
    public void testCheckEmployeeSecondConstructor(){
    	int id = 1;
    	String job = "job1";
    	String company = "compony1";
    	double salary = 1200;
        Employee employee = new Employee(id, job, company, salary);
        
        assertEquals("Error in constructor",id, employee.getEmpId());
        assertEquals("Error in constructor",job, employee.getJobTitle());
        assertEquals("Error in constructor",company, employee.getCompanyName());
    }
    
    public void testCheckEmployeeThirdConstructor(){
    	String firstName = "Inga";
    	String secondName = "Florenc";
    	int age = 18;
        Employee employee = new Employee(firstName, secondName, age);
        
        assertEquals("Error in constructor",firstName, employee.getFirstName());
        assertEquals("Error in constructor",secondName, employee.getSecondName());
        assertEquals("Error in constructor",age, employee.getAge());
    }
    
    public void testCheckEmployeeIntoduction(){
    	String intro = "My name is Ivan and i am 21years old\nI am work as developer in IT";

        Employee employee = new Employee("Ivan", "Fizdel", 21);
        employee.setJobTitle("developer");
        employee.setCompanyName("IT");
        
        assertEquals("Unexpected result of intro",intro, employee.introduce());
       
    }
}
