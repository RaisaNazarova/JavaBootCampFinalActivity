package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();
		Calculator cal = calculator.new Calculator();
		
		System.out.println(cal.sum(2.3, 1.1));

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

	}
	
	

	//TODO create the Calculator (here or in additional class)
	public class Calculator {
		public double sum(double num1, double num2) {
			return num1 + num2;
		}
		
		public double divide(double num1, double num2) {
			return num1 / num2;
		}
		
		public double minus(double num1, double num2) {
			return num1 - num2;
		}
		
		public double multiply(double num1, double num2) {
			return num1*+ num2;
		}
	}
}
