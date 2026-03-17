import java.util.Scanner;

public class Q28 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b: ");
		int a = sc.nextInt(), b = sc.nextInt();
		int res = 0;
		try{
			res = a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero.");
		}
		System.out.println("Result : "+res);
	}
}
