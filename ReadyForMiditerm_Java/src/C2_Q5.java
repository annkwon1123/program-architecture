class Currency {
	private double dollars;
	private double won;
	private double yen;
	
	public Currency(double initial_amount) {
		won = initial_amount;
		dollars = won/1000.0;
		yen = won/10.0;
	}
	
	public Currency add(Currency other) {
		return new Currency(this.won + other.won);
	}
	
	public double getDollars() {
		return dollars;
	}
	
	public double getWon() {
		return won;
	}
	
	public double getYen() {
		return yen;
	}
}

class BankAccount1 {
	private Currency balance;
	
	public BankAccount1(Currency initial_amount) {
		balance = initial_amount;
	}
	
	public Currency getBalance() {
		return balance;
	}
	
	public boolean deposit(Currency money) {
		double amount = money.getWon();
		boolean result = false;
		if (amount < 0) System.out.println("invalid deposit amount");
		else {
			balance = balance.add(money);
			result = true;
		}
		return result;
	}
	
}
public class C2_Q5 {
	public static void main(String[] args) {
		Currency money = new Currency(100);
		BankAccount1 account = new BankAccount1(money);
		account.deposit(money);
		System.out.println("balance = " + account.getBalance().getDollars());
	}
}
