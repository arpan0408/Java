import java.util.Scanner;
class InsufficientFundsException extends Exception{
	InsufficientFundsException(String m){
		super(m);
	}
}

class BankAccount{
	double balance;
	BankAccount(double balance){
		this.balance = balance;
	}
	
	public void withdraw(double amount)throws InsufficientFundsException{
		if(amount>balance)
			throw new InsufficientFundsException("Insufficient Balance!");
		else{
			System.out.println("Baalance withdaw successfully!");
			balance -= amount;
		}
	}
}

public class Q36 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BankAccount obj = new BankAccount(500000);
		System.out.println("Enter the withdraw amount: ");
		double amount = sc.nextDouble();
		try{
			obj.withdraw(amount);
		}
		catch(Exception e){
			System.out.println("Message: "+e.getMessage());
		}
	}
}
