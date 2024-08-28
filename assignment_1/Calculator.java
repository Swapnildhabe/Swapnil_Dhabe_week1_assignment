package assignment_1;

//assignment_1
//2) Create a program that takes user input and checks if the number is even or odd. 
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Enter Tow Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Select Any One You Perform : ");
		System.out.print(" 1) Addition \n 2) Subtractoin \n 3) Multiplication \n 4) Division \n Number : ");
		int key= sc.nextInt();
		switch (key) {
		case 1: {
			int result=	num1+num2;
			System.out.println("  Addition : "+num1+" + "+num2+" = "+result);
			break;
		}
		case 2: {
			
			int result = num1-num2;
			System.out.println("  Subtraction : "+num1+" - "+num2+" = "+ result);
			break;
		}
		case 3: {
			
			int result = num1 * num2;
			System.out.println("  Multiplication : "+ num1+" * "+num2+" = "+result);
			break;
		}
		case 4: {
			if(num2!=0) {
				double result = num1 / num2;
				System.out.println("  Division : "+ num1+" / "+num2+" = "+result);
			}else {
				System.err.println("Divide by Zero is not allowed");
			}
			break;
		}
		default:
			System.err.println("Choose Between 1,2,3,4 to perform");
		
		}
	}
}
