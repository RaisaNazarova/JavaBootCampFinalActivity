package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {
		

//		TODO 1 Create collection of employee (more than 5) list or map
		Employee id = new Employee(1, "tester", "accenture", 2300);
		Employee id2 = new Employee(2, "tester", "accenture", 1500);
		Employee id3 = new Employee(3, "tester", "accenture", 1700);
		Employee id4 = new Employee(4, "tester", "accenture", 2000);
		Employee id5 = new Employee(5, "tester", "accenture", 3000);
		Employee id6 = new Employee(6, "tester", "accenture", 3652);
		
		ArrayList<Employee> list = new ArrayList();
		list.add(id);
		list.add(id2);
		list.add(id3);
		list.add(id4);
		list.add(id5);
		list.add(id6);
		
		//old list
		for (Employee emp : list) {
            System.out.println(emp.getSalary());
		}
		
		Collections.sort(list, new SalaryComparator());
		 
		//sorted list
		 System.out.println("sorted list");
		for (Employee emp : list) {
            System.out.println(emp.getSalary());
		}
		
		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of a Student as a Person ->
		Person person1 = new Student("Boris", "Edidovich", 28, "school");
		// than ask him introduce()
		person1.introduce();
		// than make them Student
		Student student1 = (Student) person1;
		// than ask him introduce()
		student1.introduce();

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}

	
	
}
