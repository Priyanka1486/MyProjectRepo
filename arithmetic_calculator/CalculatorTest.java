package arithmetic_calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calcu = new Calculator();
		int num1,num2=10;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers for claculation");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		long result = calcu.addNumber(num1,num2);
		System.out.println("Addition of numbers :" +result);
		result = calcu.substractNumber(num1,num2);
		System.out.println("Substraction of numbers :" +result);
		result = calcu.multiplyNumber(num1,num2);
		System.out.println("Multiplication of numbers :" +result);
		if(num2==0)
			System.out.println("divide by 0 is not allowed");
		else {
			float value = calcu.divideNumber(num1,num2);
			System.out.println("Division of numbers :" +value);
		}
	}
}
