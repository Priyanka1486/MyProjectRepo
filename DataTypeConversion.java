import java.util.*;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int a = scan.nextInt();
		//int data type get implicitly converted into double data type.
		double d = a;
		System.out.println("Integer value get converted into double value implicitly: "+ d);
		
		//Explicit conversion of data type
		System.out.println("Enter the float value");
	// when we take input from scanner don't take f in value like 12.34f it give exception,
	//	but when we assign value directly then must use f sufic in value.	
		float fl = scan.nextFloat();
	//	float fl = 12.34f;
		int num = (int)fl;
		System.out.println("Float value get converted into Integer value Explicitly :" +num);
		
		
		System.out.println("Enter the string value");		
		//Exception Comes when using scan.nextLine() so using scan.next().
		String str = scan.next();
		//String data type get Explicitly converted into Integer data type.
		int intstr = Integer.parseInt(str);
		System.out.println("String value get converted into Integer value Explicitly: " +intstr);
		
	}

}
