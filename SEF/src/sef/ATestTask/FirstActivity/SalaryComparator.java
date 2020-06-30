package sef.ATestTask.FirstActivity;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		 if(arg0.getSalary() > arg1.getSalary())
	            return 1;
	        else if(arg0.getSalary() < arg1.getSalary())
	            return -1;
	        else
	            return 0;  
	}

}
