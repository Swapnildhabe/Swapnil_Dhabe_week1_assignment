package assignment_1;

//Basic Tasks:
//1) Write a program to perform basic arithmetic operations (addition, subtraction, multiplication, division).

public class Basic_Arithmetic_Operation {
	public static double divide (int num1, int num2) {
		double ans=0;
		if(num2 != 0) {
			ans = num1 / num2;
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		int num1 = 27;
		int num2 = 9;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		double division = divide(num1,  num2);
		
		System.out.println("Addition "+num1+" + "+num2+ " = "+addition);
		System.out.println("Subtraction "+num1+" - "+num2+ " = "+subtraction);
		System.out.println("Multiplication "+num1+" * "+num2+ " = "+multiplication);
		if(division !=0) {
		System.out.println("Division "+num1+" / "+num2+ " = "+division);
		}else {
			System.err.println("Divisor is can not be '0' ");
		}
		
	}
}
