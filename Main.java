
public class Main {
	public static void main(String[] args) {
		// Deposit money
		// Withdraw money
		// Check money
		
		Bank_System bank = new Bank_System();
		bank.deposit(100);
		double result = bank.check();
		System.out.println(result);
		
		bank.deposit(100);
		result = bank.check();
		System.out.println(result);
		
		bank.withdraw(20);
		result = bank.check();
		System.out.println(result);
		
		
		
	}
	
}
