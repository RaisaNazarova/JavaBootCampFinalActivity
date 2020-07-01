package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	public void testPersonConstructor(){
		Person person = new Person();
		assertEquals("I am an error message", "Unknown", person.getFirstName());
		
		person.setSecondName("Ivanov");
		assertEquals("I am an error message", "Ivanov", person.getSecondName());
		
	
	}	 
	
	public void testPersonConstructorTwo() {
		Person person = new Person("Aleksandrs", "Solovjovs", 18);
		assertEquals("I am an error message", 18, person.getAge());
		
		}
	
	public void testPersonMethodIntro() {
		Person person = new Person();
		String intro = "My name is " + "Unknown" + " and i am" + 0 + "years old";
		assertEquals("I am an error message", intro, person.introduce());
	}
	


}
