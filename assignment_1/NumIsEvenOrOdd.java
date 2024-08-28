package assignment_1;
//assignment_1
//3) Implement a simple calculator using switch-case statements. Implement a simple calculator using switch-case statements. 

import java.util.Scanner;

public class NumIsEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Number to check Number is Even Or Odd : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num +" is Even Number");
		}else {
			System.out.println(num+" is Odd Number");
		}
	}
	
}	
