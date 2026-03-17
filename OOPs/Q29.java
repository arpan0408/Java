import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String m){
		super(m);
	}
}

public class Q29 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		try{
			if(age<18)
				throw new InvalidAgeException("Not eligible to vote.");
			else
				System.out.println("Eligible to vote.");
		}
		catch(Exception e){
			System.out.println("Message: "+e.getMessage());
		}
		finally{
			sc.close();
		}
		
	}
}
