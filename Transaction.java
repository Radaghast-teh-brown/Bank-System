
public class Transaction {
	String date;
	double amount;
	Account A;
	Account B;
	
	public void setDate(String date) {
		this.date = date;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setAcounts(Account A, Account B) {
		this.A = A;
		this.B = B;
	}
}
