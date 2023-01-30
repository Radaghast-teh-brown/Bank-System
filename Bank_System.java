
public class Bank_System {
	
	private double money = 0.0;
	
	
	public void deposit(double input) {
		if(input >0) {
			money += input;
		}
	}
	
	public void withdraw(double input) {
		money -= input;
	}
	
	public double check() {
		return this.money;
	}
}
